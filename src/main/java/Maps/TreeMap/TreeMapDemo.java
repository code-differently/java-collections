package Maps.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> leaderboard = new TreeMap<>();

        // Adding elements
        leaderboard.put(3, "Jordan");
        leaderboard.put(1, "Taylor");
        leaderboard.put(4, "Morgan");
        leaderboard.put(2, "Alex");

        System.out.println("Leaderboard (Sorted by Key): " + leaderboard);

        // Access a value
        System.out.println("Rank 1: " + leaderboard.get(1));

        // First and last keys
        System.out.println("First Key: " + ((TreeMap<Integer, String>) leaderboard).firstKey());
        System.out.println("Last Key: " + ((TreeMap<Integer, String>) leaderboard).lastKey());

        // Iterating through entries
        System.out.println("\nLeaderboard Rankings:");

        for (Map.Entry<Integer, String> entry : leaderboard.entrySet()) {
            System.out.println("Rank " + entry.getKey() + ": " + entry.getValue());
        }

        // Removing an entry
        leaderboard.remove(2);
        System.out.println("\nAfter removing rank 2: " + leaderboard);
    }
}
