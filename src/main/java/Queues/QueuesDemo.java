package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesDemo {
    public static void run() {

        System.out.println("=== Queues Demo ===");

        Queue<String> queue = new LinkedList<>();

        queue.offer("First");

        queue.offer("Second");

        queue.offer("Third");

        System.out.println("Queue: " + queue);

        System.out.println("Queue poll(): " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("Front");

        deque.offerLast("Back");

        deque.offerFirst("New Front");

        System.out.println("Deque: " + deque);

        System.out.println("Deque pollFirst(): " + deque.pollFirst());

        System.out.println("Deque pollLast(): " + deque.pollLast());

        System.out.println("Deque after removals: " + deque);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(100);

        arrayDeque.offer(200);

        arrayDeque.offer(300);

        System.out.println("ArrayDeque: " + arrayDeque);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(40);

        priorityQueue.offer(10);

        priorityQueue.offer(30);

        priorityQueue.offer(20);
        System.out.println("PriorityQueue: " + priorityQueue);

        System.out.println("PriorityQueue poll(): " + priorityQueue.poll());

        System.out.println("PriorityQueue after poll: " + priorityQueue);

        System.out.println();
    }
}