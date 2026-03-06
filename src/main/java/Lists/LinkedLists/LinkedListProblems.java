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

    Example
    Input: [10,20,30], value=5
    Output: [5,10,20,30]
    */
    public static void addToFront(LinkedList<Integer> list, int value) {
        list.add(0, value);
        // TODO: Implement this method

    }

    /*
    Problem 2
    Add a value to the END of the LinkedList.

    Example
    Input: [10,20,30], value=40
    Output: [10,20,30,40]
    */
    public static void addToEnd(LinkedList<Integer> list, int value) {
        list.add(value);
        // TODO: Implement this method

    }

    /*
    Problem 3
    Remove the FIRST element from the LinkedList.

    Example
    Input: [10,20,30]
    Output: [20,30]
    */
    public static void removeFirstElement(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.remove(0);
        }
        // TODO: Implement this method

    }

    /*
    Problem 4
    Remove the LAST element from the LinkedList.

    Example
    Input: [10,20,30]
    Output: [10,20]
    */
    public static void removeLastElement(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.remove(list.size()-1);
        }
        // TODO: Implement this method

    }

    /*
    Problem 5
    Return the FIRST element in the LinkedList.

    Example
    Input: [10,20,30]
    Output: 10
    */
    public static int getFirstElement(LinkedList<Integer> list) {

        // TODO: Implement this method
        return list.get(0);
        //return list.getFirst(); i tried this first and it worked also
        //return 0;
    }

    /*
    Problem 6
    Return the LAST element in the LinkedList.

    Example
    Input: [10,20,30]
    Output: 30
    */
    public static int getLastElement(LinkedList<Integer> list) {
        return list.get(list.size() - 1);
        //return list.getLast(); i tried this first and it worked also
        // TODO: Implement this method

        //return 0;
    }
}
