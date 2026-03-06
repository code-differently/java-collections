package Lists.LinkedLists;

import java.util.LinkedList;

public class LinkedListProblems {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        addToFront(numbers, 5);
        addToEnd(numbers, 60);

        System.out.println("List after additions: " + numbers);

        removeFirstElement(numbers);
        removeLastElement(numbers);

        System.out.println("List after removals: " + numbers);

        System.out.println("First Element: " + getFirstElement(numbers));
        System.out.println("Last Element: " + getLastElement(numbers));
    }

    /*
    Problem 1
    Add a value to the FRONT of the LinkedList.
    */
    public static void addToFront(LinkedList<Integer> list, int value) {
        list.addFirst(value);
    }

    /*
    Problem 2
    Add a value to the END of the LinkedList.
    */
    public static void addToEnd(LinkedList<Integer> list, int value) {
        list.addLast(value);
    }

    /*
    Problem 3
    Remove the FIRST element from the LinkedList.
    */
    public static void removeFirstElement(LinkedList<Integer> list) {
        if(!list.isEmpty()) {
            list.removeFirst();
        }
    }

    /*
    Problem 4
    Remove the LAST element from the LinkedList.
    */
    public static void removeLastElement(LinkedList<Integer> list) {
        if(!list.isEmpty()) {
            list.removeLast();
        }
    }

    /*
    Problem 5
    Return the FIRST element in the LinkedList.
    */
    public static int getFirstElement(LinkedList<Integer> list) {
        if(!list.isEmpty()) {
            return list.getFirst();
        }
        throw new RuntimeException("List is empty");
    }

    /*
    Problem 6
    Return the LAST element in the LinkedList.
    */
    public static int getLastElement(LinkedList<Integer> list) {
        if(!list.isEmpty()) {
            return list.getLast();
        }
        throw new RuntimeException("List is empty");
    }
}