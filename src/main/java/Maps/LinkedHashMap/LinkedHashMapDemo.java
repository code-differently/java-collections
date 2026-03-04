package Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> scores = new LinkedHashMap<>();

        // Adding key-value pairs
        scores.put("Jordan", 95);
        scores.put("Taylor", 87);
        scores.put("Morgan", 90);
        scores.put("Alex", 82);

        System.out.println("Scores: " + scores);

        // Notice the insertion order is preserved
        System.out.println("\nIterating through entries:");

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Updating a value
        scores.put("Taylor", 91);
        System.out.println("\nAfter updating Taylor: " + scores);

        // Removing a key
        scores.remove("Alex");
        System.out.println("\nAfter removing Alex: " + scores);

        // Accessing values
        System.out.println("\nJordan's Score: " + scores.get("Jordan"));
    }
}
