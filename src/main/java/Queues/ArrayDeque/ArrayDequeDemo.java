package Queues.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> tasks = new ArrayDeque<>();

        // Using ArrayDeque as a Queue (FIFO)
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println("Queue Behavior: " + tasks);

        System.out.println("Removing from queue: " + tasks.poll());
        System.out.println("Queue after poll: " + tasks);

        // Using ArrayDeque as a Stack (LIFO)
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack Behavior: " + stack);

        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Adding to front and back
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Start");
        deque.addLast("Middle");
        deque.addLast("End");

        System.out.println("\nDeque behavior: " + deque);

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
    }
}
