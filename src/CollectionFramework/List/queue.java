package src.CollectionFramework.List;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {


        Queue queue = new PriorityQueue();


        // offer -> add
        // PQ -> Naturally Sorted

        queue.offer(30);
        queue.offer(20);
        queue.offer(10);
        queue.offer(40);
        queue.offer(50);
        queue.add(90);

        queue.remove(10);

        System.out.println(queue);
        System.out.println(queue.poll()); // Poll -> First value is trimmed.
        System.out.println(queue);
        System.out.println(queue.peek());





    }
}
