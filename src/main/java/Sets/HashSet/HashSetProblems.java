package Sets.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetProblems {
    public static void main(String[] args) {

        // You can test your methods here
        // ---------- Problem 1 Test ----------
        System.out.println("Problem 1: addElement");
        Set<String> fruits = new HashSet<>();
        addElement(fruits, "apple");
        System.out.println(fruits); // Expected: [apple]


        // ---------- Problem 2 Test ----------
        System.out.println("\nProblem 2: containsValue");
        addElement(fruits, "banana");
        System.out.println(containsValue(fruits, "banana")); // Expected: true
        System.out.println(containsValue(fruits, "grape"));  // Expected: false


        // ---------- Problem 3 Test ----------
        System.out.println("\nProblem 3: removeValue");
        removeValue(fruits, "apple");
        System.out.println(fruits); // Expected: [banana]


        // ---------- Problem 4 Test ----------
        System.out.println("\nProblem 4: getUniqueCount");
        addElement(fruits, "banana"); // duplicate attempt
        addElement(fruits, "banana");
        addElement(fruits, "orange");
        System.out.println(getUniqueCount(fruits)); // Expected: 2


        // ---------- Problem 5 Test ----------
        System.out.println("\nProblem 5: getUniqueValues");
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3);
        Set<Integer> uniqueNumbers = getUniqueValues(numbers);
        System.out.println(uniqueNumbers); // Expected: [1, 2, 3]
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
        if (set.contains(value)){
            return true;
        }
        return false;
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
        Set<Integer> set = new HashSet<>();
        for (Integer number: numbers){
            set.add(number);
        }
        return set;
    }
}
