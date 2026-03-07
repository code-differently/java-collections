package Queues.Deque;

import java.util.Deque;

public class DequeProblems {
    public static void main(String[] args) {

        // You can test your methods here

    }

    /*
    Problem 1
    Add a value to the FRONT of the deque.

    Example
    Input: value = 5
    Output: [5]
    */
    //addFirst() throws an exception if the deque is full (rare, usually unbounded).
    //offerFirst() returns false instead of throwing an exception if it cannot add.
    public static void addFront(Deque<Integer> deque, int value) {

        // TODO: Implement this method
        deque.addFirst(value); // adds value to the front
        // alternatively: deque.offerFirst(value);
    }


    /*
    Problem 2
    Add a value to the BACK of the deque.

    Example
    Input: value = 10
    Output: [5,10]
    */


        // TODO: Implement this method

        //addLast() → adds to the end (back) of the deque.
        //offerLast() → safer version, returns false if it cannot add.
        //Using both addFront() and addBack() tp simulate double-ended queues easily.

import java.util.Deque;

        public static void addBack(Deque<Integer> deque, int value) {
            deque.addLast(value); // adds value to the back
            // alternatively: deque.offerLast(value);
        }
    }

    /*
    Problem 3
    Remove and return the FRONT element of the deque.

    Example
    Input: [5,10,15]
    Output: 5
    */
 //In a Deque, we can remove and return the front element using removeFirst() or pollFirst().
              // removeFirst() throws an exception if the deque is empty.
      //  pollFirst() returns null if the deque is empty.
    public static Integer removeFront(Deque<Integer> deque) {

        // TODO: Implement this method

        return deque.pollFirst(); // removes and returns the front element, or null if empty
    }
//pollFirst() is preferred when you want null instead of an exception for empty deques.
//removeFirst() can be used if you want to enforce that the deque must have elements


    /*
    Problem 4
    Remove and return the BACK element of the deque.

    Example
    Input: [5,10,15]
    Output: 15
    */


        // TODO: Implement this method

//In a Deque, you can remove and return the back element using removeLast() or pollLast().
//removeLast() throws an exception if the deque is empty.
//pollLast() returns null if the deque is empty (safer).

        import java.util.Deque;

public static Integer removeBack(Deque<Integer> deque) {
    return deque.pollLast(); // removes and returns the back element, or null if empty
}

  /*  Problem 5
    Return the FRONT element without removing it.

    Example
    Input: [5,10,15]
    Output: 5
    */

        // TODO: Implement this method

       // In a Deque, you can return the front element without removing it using peekFirst() or getFirst().
             //   peekFirst() returns null if the deque is empty.

import java.util.Deque;

        public static Integer peekFront(Deque<Integer> deque) {
            return deque.peekFirst(); // returns the front element without removing it, or null if empty
        }

    /*
    Problem 6
    Return the BACK element without removing it.

    Example
    Input: [5,10,15]
    Output: 15
    */


        // TODO: Implement this method

       // In a Deque, you can return the back element without removing it using peekLast() or getLast().
             //   peekLast() returns null if the deque is empty (safe).
             //   getLast() throws NoSuchElementException if the deque is empty.


import java.util.Deque;

        public static Integer peekBack(Deque<Integer> deque) {
            return deque.peekLast(); // returns the back element without removing it, or null if empty
        }