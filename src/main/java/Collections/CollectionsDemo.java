package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {
    public static void run() {
        System.out.println("=== Collection Demo ===");

        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");

        fruits.add("Banana");

        fruits.add("Orange");

        System.out.println("Starting collection: " + fruits);

        System.out.println("Size: " + fruits.size());

        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        fruits.remove("Apple");

        System.out.println("After removing Apple: " + fruits);

        System.out.println("Is empty? " + fruits.isEmpty());

        System.out.println();
    }
}