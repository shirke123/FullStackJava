package Multithreading;

public class ProducerConsumer {
    int i;
    boolean flag = true;

    public void setI(int i) {
        if (!flag) {
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("set:" + i);
        this.i = i;
        flag = false;
        notify();
    }

    public void getI() {
        if (flag){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        System.out.println("get:" + i);
        flag = true;
        notify();
    }
}
class Producer implements Runnable {

    ProducerConsumer producerConsumer;

   Producer(ProducerConsumer producerConsumer){
   this.producerConsumer=producerConsumer;
   }

   public void run() {
    int i = 0;
    while (true) {
        producerConsumer.setI(i++);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     }
  }
}

class  Consumer implements Runnable{

    ProducerConsumer producerConsumer;

    Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;
    }

    @Override
    public void run() {
        while (true) {
        producerConsumer.getI();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
  }
}

class  Main{
    public static void main(String[] args) {
        ProducerConsumer producerConsumer=new ProducerConsumer();
        Producer producer=new Producer(producerConsumer);
        Consumer consumer=new Consumer(producerConsumer);

        Thread t1= new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.start();
        t2.start();
    }

}


