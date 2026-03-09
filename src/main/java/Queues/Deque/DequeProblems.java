package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(90);

        addFront(deque,100);
        deque.addLast(1000);

        addBack(deque,120);
//        removeFront(deque);
//        removeFront(deque);
//        removeBack(deque);

        System.out.println(peekFront(deque));
        System.out.println(peekBack(deque));

    }

    /*
    Problem 1
    Add a value to the FRONT of the deque.

    Example
    Input: value = 5
    Output: [5]
    */
    public static void addFront(Deque<Integer> deque, int value) {
        deque.addFirst(value);
        // TODO: Implement this method

    }

    /*
    Problem 2
    Add a value to the BACK of the deque.

    Example
    Input: value = 10
    Output: [5,10]
    */
    public static void addBack(Deque<Integer> deque, int value) {

        deque.addLast(value);
        // TODO: Implement this method

    }

    /*
    Problem 3
    Remove and return the FRONT element of the deque.

    Example
    Input: [5,10,15]
    Output: 5
    */
    public static Integer removeFront(Deque<Integer> deque) {

        return deque.removeFirst();
        // TODO: Implement this method

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

        return deque.peekFirst();
    }

}
