package Queues.Deque;

import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {

        // You can test your methods here
        Deque<Integer> deque = new java.util.ArrayDeque<>();

        // Test adding
        addFront(deque, 10);
        addFront(deque, 5);
        addBack(deque, 20);

        System.out.println("After adding: " + deque);

        // Test peeking
        System.out.println("Peek Front: " + peekFront(deque));

        System.out.println("Peek Back: " + peekBack(deque));

        // Test removing
        System.out.println("Removed Front: " + removeFront(deque));

        System.out.println("After removing front: " + deque);

        System.out.println("Removed Back: " + removeBack(deque));

        System.out.println("Final deque: " + deque);


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

        return deque.peekFirst();
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

        return deque.peekLast();
    }

}
