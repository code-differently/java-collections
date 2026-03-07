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
   */
    public static void addToFront(ArrayDeque<Integer> deque, int value) {

        // adds the value to the front of the deque
        deque.addFirst(value);
    }

    /*
    Problem 2
    Add a number to the BACK of the deque.
    */
    public static void addToBack(ArrayDeque<Integer> deque, int value) {

        // adds the value to the back of the deque
        deque.addLast(value);
    }

    /*
    Problem 3
    Remove the element at the FRONT of the deque.
    */
    public static void removeFront(ArrayDeque<Integer> deque) {

        // removes the first element
        deque.removeFirst();
    }

    /*
    Problem 4
    Remove the element at the BACK of the deque.
    */
    public static void removeBack(ArrayDeque<Integer> deque) {

        // removes the last element
        deque.removeLast();
    }

    /*
    Problem 5
    Return the FIRST element in the deque without removing it.
    */
    public static Integer peekFront(ArrayDeque<Integer> deque) {

        // returns first element without removing it
        return deque.peekFirst();
    }

    /*
    Problem 6
    Return the LAST element in the deque without removing it.
    */
    public static Integer peekBack(ArrayDeque<Integer> deque) {

        // returns last element without removing it
        return deque.peekLast();
    }
}