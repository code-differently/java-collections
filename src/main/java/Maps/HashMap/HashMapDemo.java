package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Jordan", 92);
        studentScores.put("Taylor", 85);
        studentScores.put("Morgan", 88);

        System.out.println("Student Scores: " + studentScores);

        // Access value by key
        int score = studentScores.get("Jordan");
        System.out.println("Jordan's Score: " + score);

        // Check if key exists
        if (studentScores.containsKey("Taylor")) {
            System.out.println("Taylor is in the map.");
        }

        // Update value
        studentScores.put("Morgan", 90);
        System.out.println("Updated Scores: " + studentScores);

        // Remove entry
        studentScores.remove("Taylor");
        System.out.println("After Removal: " + studentScores);

        // Loop through keys
        System.out.println("\nKeys:");
        for (String key : studentScores.keySet()) {
            System.out.println(key);
        }

        // Loop through values
        System.out.println("\nValues:");
        for (Integer value : studentScores.values()) {
            System.out.println(value);
        }

        // Loop through entries
        System.out.println("\nEntries:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
