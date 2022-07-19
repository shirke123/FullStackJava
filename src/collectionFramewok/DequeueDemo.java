package collectionFramewok;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer>deque=new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.addFirst(50);
        deque.addLast(60);

        System.out.println(deque.peek());  // first dequeue.
        System.out.println(deque.peekFirst());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        Iterator<Integer>iterator=deque.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
