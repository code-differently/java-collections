package Lists.LinkedLists;

import java.util.LinkedList;

public class LinkedListProblems {

    public class LinkedListPractice {

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

        // Problem 1
        public static void addToFront(LinkedList<Integer> list, int value) {

            list.addFirst(value);

        }

        // Problem 2
        public static void addToEnd(LinkedList<Integer> list, int value) {

            list.addLast(value);

        }

        // Problem 3
        public static void removeFirstElement(LinkedList<Integer> list) {

            list.removeFirst();

        }

        // Problem 4
        public static void removeLastElement(LinkedList<Integer> list) {

            list.removeLast();

        }

        // Problem 5
        public static int getFirstElement(LinkedList<Integer> list) {

            return list.getFirst();

        }

        // Problem 6
        public static int getLastElement(LinkedList<Integer> list) {

            return list.getLast();

        }
    }
}