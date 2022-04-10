package collectionFramewok;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer>queue=new PriorityQueue<>(5);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(45);
        queue.add(45);
        queue.add(45);
        queue.offer(50);

        queue.remove();
        System.out.println(queue.peek());  // top element of the stack.
        System.out.println(queue.element()); //
        System.out.println(queue.poll());  //

        System.out.println(queue);




    }
}
