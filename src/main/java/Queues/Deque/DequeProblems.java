package Queues.Deque;

import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {

        // You can test your methods here
        //Your code doesn’t show values or an ArrayList because a
        // Deque is just an interface. It describes behavior(front/back operations),
        // but it is not the actual data structure storing the values.

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
        deque.removeFirst();
        // TODO: Implement this method

        return null;
    }

    /*
    Problem 4
    Remove and return the BACK element of the deque.

    Example
    Input: [5,10,15]
    Output: 15
    */
    public static Integer removeBack(Deque<Integer> deque) {
        deque.removeLast();
        // TODO: Implement this method

        return null;
    }

    /*
    Problem 5
    Return the FRONT element without removing it.

    Example
    Input: [5,10,15]
    Output: 5
    */
    public static Integer peekFront(Deque<Integer> deque) {
       return deque.peekFirst();
        // TODO: Implement this method


    }

    /*
    Problem 6
    Return the BACK element without removing it.

    Example
    Input: [5,10,15]
    Output: 15
    */
    public static Integer peekBack(Deque<Integer> deque) {
        return deque.peekLast();
        // TODO: Implement this method


    }

}
