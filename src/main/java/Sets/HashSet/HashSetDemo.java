package Sets.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate

        System.out.println("Fruits: " + fruits);

        // Checking if element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana exists in the set.");
        }

        // Removing an element
        fruits.remove("Orange");

        System.out.println("After removal: " + fruits);

        // Size of the set
        System.out.println("Total unique fruits: " + fruits.size());

        // Iterating through the set
        System.out.println("\nIterating through set:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
