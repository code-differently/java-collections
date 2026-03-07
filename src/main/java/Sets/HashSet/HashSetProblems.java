package Sets.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetProblems {
    public static void main(String[] args) {

            Set<String> fruits = new HashSet<>();

            addElement(fruits, "apple");
            addElement(fruits, "banana");
            addElement(fruits, "apple");

            System.out.println("Set: " + fruits);

            System.out.println("Contains banana: " + containsValue(fruits,"banana"));

            removeValue(fruits,"apple");
            System.out.println("After removal: " + fruits);

            System.out.println("Unique count: " + getUniqueCount(fruits));

            List<Integer> nums = List.of(1,2,2,3,3,3);
            System.out.println("Unique numbers: " + getUniqueValues(nums));


    }

    /*
    Problem 1
    Add an element to the set.

    Example
    Input: "apple"
    Output: {"apple"}
    */
    public static void addElement(Set<String> set, String value) {

        // TODO: Implement this method
        // Add the value to the set
        set.add(value);
    }

    /*
    Problem 2
    Check if the set contains a value.

    Example
    Input: "banana"
    Output: true or false
    */
    public static boolean containsValue(Set<String> set, String value) {

        // TODO: Implement this method
        // Return true if value exists in the set
        return set.contains(value);
    }

    /*
    Problem 3
    Remove a value from the set.

    Example
    Input: "apple"
    Output: value removed
    */
    public static void removeValue(Set<String> set, String value) {

        // TODO: Implement this method
        // Remove the value from the set
        set.remove(value);

    }

    /*
    Problem 4
    Return the number of unique elements in the set.

    Example
    Input: {"apple","banana","apple"}
    Output: 2
    */
    public static int getUniqueCount(Set<String> set) {

        // TODO: Implement this method
        // Return the number of unique elements
        return set.size();
    }

    /*
    Problem 5
    Given a list of integers, return a HashSet containing only the unique values.

    Example
    Input: [1,2,2,3,3,3]
    Output: {1,2,3}
    */
    public static Set<Integer> getUniqueValues(List<Integer> numbers) {

        // TODO: Implement this method

        // Convert list to HashSet to remove duplicates
        Set<Integer> unique = new HashSet<>(numbers);

        return unique;

    }
}
