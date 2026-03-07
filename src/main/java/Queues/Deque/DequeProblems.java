package Queues.Deque;

import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {

        // You can test your methods here

    }

    /*
    Problem 1
    Add a value to the FRONT of the deque.
    */
    public static void addFront(Deque<Integer> deque, int value) {

        // add value to the front
        deque.addFirst(value);
    }

    /*
    Problem 2
    Add a value to the BACK of the deque.
    */
    public static void addBack(Deque<Integer> deque, int value) {

        // add value to the back
        deque.addLast(value);
    }

    /*
    Problem 3
    Remove and return the FRONT element of the deque.
    */
    public static Integer removeFront(Deque<Integer> deque) {

        // remove and return first element
        return deque.removeFirst();
    }

    /*
    Problem 4
    Remove and return the BACK element of the deque.
    */
    public static Integer removeBack(Deque<Integer> deque) {

        // remove and return last element
        return deque.removeLast();
    }

    /*
    Problem 5
    Return the FRONT element without removing it.
    */
    public static Integer peekFront(Deque<Integer> deque) {

        // look at first element without removing
        return deque.peekFirst();
    }

    /*
    Problem 6
    Return the BACK element without removing it.
    */
    public static Integer peekBack(Deque<Integer> deque) {

        // look at last element without removing
        return deque.peekLast();
    }
}