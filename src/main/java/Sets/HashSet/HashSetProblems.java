package Sets.HashSet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetProblems {
    public static void main(String[] args) {

        // You can test your methods here

    }

    /*
    Problem 1
    Add an element to the set.
    */
    public static void addElement(Set<String> set, String value) {

        // add the value to the set
        set.add(value);
    }

    /*
    Problem 2
    Check if the set contains a value.
    */
    public static boolean containsValue(Set<String> set, String value) {

        // return true if set contains the value
        return set.contains(value);
    }

    /*
    Problem 3
    Remove a value from the set.
    */
    public static void removeValue(Set<String> set, String value) {

        // remove the value from the set
        set.remove(value);

        System.out.println("value removed");
    }

    /*
    Problem 4
    Return the number of unique elements in the set.
    */
    public static int getUniqueCount(Set<String> set) {

        // size() returns number of unique values
        return set.size();
    }

    /*
    Problem 5
    Given a list of integers, return a HashSet containing only the unique values.
    */
    public static Set<Integer> getUniqueValues(List<Integer> numbers) {

        // HashSet automatically removes duplicates
        Set<Integer> uniqueValues = new HashSet<>(numbers);

        return uniqueValues;
    }
}