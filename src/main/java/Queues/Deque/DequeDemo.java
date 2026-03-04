package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front
        deque.addFirst("B");
        deque.addFirst("A");

        // Add elements to the back
        deque.addLast("C");
        deque.addLast("D");

        System.out.println("Deque: " + deque);

        // Peek elements
        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        // Remove elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);

        // Iterating through deque
        System.out.println("\nIterating through deque:");

        for (String item : deque) {
            System.out.println(item);
        }
    }
}

