package Queues.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeProblems {
    public static void main(String[] args) {

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        addToFront(numbers, 10);
        addToFront(numbers, 5);
        addToBack(numbers, 20);

        System.out.println("Deque: " + numbers);

        removeFront(numbers);
        System.out.println("After removing front: " + numbers);

        removeBack(numbers);
        System.out.println("After removing back: " + numbers);
    }

    /*
    Problem 1
    Add a number to the FRONT of the deque.

    Example
    Input: value = 5
    Output: [5]
    */
    public static void addToFront(ArrayDeque<Integer> deque, int value) {

        // TODO: Implement this method
        deque.addFirst(value);

    }

    /*
    Problem 2
    Add a number to the BACK of the deque.

    Example
    Input: value = 10
    Output: [5,10]
    */
    public static void addToBack(ArrayDeque<Integer> deque, int value) {

        // TODO: Implement this method
        deque.addLast(value);

    }

    /*
    Problem 3
    Remove the element at the FRONT of the deque.

    Example
    Input: [5,10,20]
    Output: [10,20]
    */
    public static void removeFront(ArrayDeque<Integer> deque) {

        // TODO: Implement this method
        deque.removeFirst();

    }

    /*
    Problem 4
    Remove the element at the BACK of the deque.

    Example
    Input: [5,10,20]
    Output: [5,10]
    */
    public static void removeBack(ArrayDeque<Integer> deque) {

        // TODO: Implement this method
        deque.removeLast();

    }

    /*
    Problem 5
    Return the FIRST element in the deque without removing it.

    Example
    Input: [5,10,20]
    Output: 5
    */
    public static Integer peekFront(ArrayDeque<Integer> deque) {

        // TODO: Implement this method

        return deque.getFirst();
    }

    /*
    Problem 6
    Return the LAST element in the deque without removing it.

    Example
    Input: [5,10,20]
    Output: 20
    */
    public static Integer peekBack(ArrayDeque<Integer> deque) {

        // TODO: Implement this method

        return deque.getLast();
    }
}
