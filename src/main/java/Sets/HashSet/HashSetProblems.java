package Sets.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetProblems {
    public static void main(String[] args) {

        // You can test your methods here
        HashSet<String> set = new HashSet<>();
        List<Integer> nums = new ArrayList<>();


        addElement(set,"Fred");
        addElement(set,"Fred");
        addElement(set,"Fredd");
        addElement(set,"Freddy");

        System.out.println(containsValue(set,"Fred"));

        System.out.println(getUniqueCount(set));

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(30);
        nums.add(40);

        System.out.println(set);
        System.out.println((nums));
        System.out.println(getUniqueValues(nums));
        removeValue(set,"Fred");
        System.out.println(set);

    }

    /*
    Problem 1
    Add an element to the set.

    Example
    Input: "apple"
    Output: {"apple"}
    */
    public static void addElement(Set<String> set, String value) {

        set.add(value);
        // TODO: Implement this method

    }

    /*
    Problem 2
    Check if the set contains a value.

    Example
    Input: "banana"
    Output: true or false
    */
    public static boolean containsValue(Set<String> set, String value) {
        return set.contains(value);
        // TODO: Implement this method

    }

    /*
    Problem 3
    Remove a value from the set.

    Example
    Input: "apple"
    Output: value removed
    */
    public static void removeValue(Set<String> set, String value) {

        set.remove(value);
        // TODO: Implement this method

    }

    /*
    Problem 4
    Return the number of unique elements in the set.

    Example
    Input: {"apple","banana","apple"}
    Output: 2
    */
    public static int getUniqueCount(Set<String> set) {

     return set.size();
        // TODO: Implement this method

    }

    /*
    Problem 5
    Given a list of integers, return a HashSet containing only the unique values.

    Example
    Input: [1,2,2,3,3,3]
    Output: {1,2,3}
    */
    public static Set<Integer> getUniqueValues(List<Integer> numbers) {

        Set<Integer> uniqueValues = new HashSet<>(numbers);

        return uniqueValues;
        // TODO: Implement this method

    }
}
