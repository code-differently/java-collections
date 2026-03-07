package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {

        // You can test your methods here
        Deque<Integer> deque = new ArrayDeque<>();

        // ---------- Problem 1 ----------
        System.out.println("Problem 1: addFront");
        addFront(deque, 5);
        System.out.println(deque); // Expected: [5]

        // ---------- Problem 2 ----------
        System.out.println("\nProblem 2: addBack");
        addBack(deque, 10);
        addBack(deque, 15);
        System.out.println(deque); // Expected: [5, 10, 15]

        // ---------- Problem 3 ----------
        System.out.println("\nProblem 3: removeFront");
        Integer removedFront = removeFront(deque);
        System.out.println("Removed: " + removedFront); // Expected: 5
        System.out.println(deque); // Expected: [10, 15]

        // ---------- Problem 4 ----------
        System.out.println("\nProblem 4: removeBack");
        Integer removedBack = removeBack(deque);
        System.out.println("Removed: " + removedBack); // Expected: 15
        System.out.println(deque); // Expected: [10]

        // ---------- Problem 5 ----------
        System.out.println("\nProblem 5: peekFront");
        System.out.println("Front: " + peekFront(deque)); // Expected: 10
        System.out.println(deque); // Should still be [10]

        // ---------- Problem 6 ----------
        System.out.println("\nProblem 6: peekBack");
        System.out.println("Back: " + peekBack(deque)); // Expected: 10
        System.out.println(deque); // Should still be [10]
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
