package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Test addFront
        addFront(deque, 5);
        System.out.println("After addFront(5): " + deque);

        // Test addBack
        addBack(deque, 10);
        addBack(deque, 15);
        System.out.println("After addBack(10,15): " + deque);

        // Test peekFront
        System.out.println("Peek Front: " + peekFront(deque));

        // Test peekBack
        System.out.println("Peek Back: " + peekBack(deque));

        // Test removeFront
        System.out.println("Removed Front: " + removeFront(deque));
        System.out.println("Deque after removeFront: " + deque);

        // Test removeBack
        System.out.println("Removed Back: " + removeBack(deque));
        System.out.println("Deque after removeBack: " + deque);

    }

    /*
    Problem 1
    Add a value to the FRONT of the deque.

    Example
    Input: value = 5
    Output: [5]
    */
    public static void addFront(Deque<Integer> deque, int value) {

        // TODO: Implement this method
        deque.addFirst(value);
    }

    /*
    Problem 2
    Add a value to the BACK of the deque.

    Example
    Input: value = 10
    Output: [5,10]
    */
    public static void addBack(Deque<Integer> deque, int value) {

        // TODO: Implement this method
        deque.addLast(value);

    }

    /*
    Problem 3
    Remove and return the FRONT element of the deque.

    Example
    Input: [5,10,15]
    Output: 5
    */
    public static Integer removeFront(Deque<Integer> deque) {

        // TODO: Implement this method
        return deque.removeFirst();
    }

    /*
    Problem 4
    Remove and return the BACK element of the deque.

    Example
    Input: [5,10,15]
    Output: 15
    */
    public static Integer removeBack(Deque<Integer> deque) {

        // TODO: Implement this method
        return deque.removeLast();
    }

    /*
    Problem 5
    Return the FRONT element without removing it.

    Example
    Input: [5,10,15]
    Output: 5
    */
    public static Integer peekFront(Deque<Integer> deque) {

        // TODO: Implement this method
        return deque.getFirst();
    }

    /*
    Problem 6
    Return the BACK element without removing it.

    Example
    Input: [5,10,15]
    Output: 15
    */
    public static Integer peekBack(Deque<Integer> deque) {

        // TODO: Implement this method
        return deque.getLast();
    }

}
