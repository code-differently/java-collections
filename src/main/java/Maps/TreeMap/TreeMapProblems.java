package Maps.TreeMap;

import java.util.TreeMap;

public class TreeMapProblems {
    public static void main(String[] args) {

        TreeMap<Integer, String> rankings = new TreeMap<>();

        addPlayer(rankings, 3, "Jordan");
        addPlayer(rankings, 1, "Taylor");
        addPlayer(rankings, 2, "Morgan");

        System.out.println("Rankings: " + rankings);

        System.out.println("Top Player: " + getTopPlayer(rankings));
        System.out.println("Lowest Ranked Player: " + getLowestPlayer(rankings));

        removePlayer(rankings, 2);
        System.out.println("After removal: " + rankings);

        System.out.println("Next rank after 1: " + getNextRank(rankings, 1));
    }

    /*
    Problem 1
    Add a player to the TreeMap with their rank.
    */
    public static void addPlayer(TreeMap<Integer, String> map, int rank, String name) {
        map.put(rank, name);
    }

    /*
    Problem 2
    Return the player with the highest ranking (smallest key).
    */
    public static String getTopPlayer(TreeMap<Integer, String> map) {
        if (map.isEmpty()) return null;
        return map.firstEntry().getValue();
    }

    /*
    Problem 3
    Return the player with the lowest ranking (largest key).
    */
    public static String getLowestPlayer(TreeMap<Integer, String> map) {
        if (map.isEmpty()) return null;
        return map.lastEntry().getValue();
    }

    /*
    Problem 4
    Remove a player based on their rank.
    */
    public static void removePlayer(TreeMap<Integer, String> map, int rank) {
        map.remove(rank);
    }

    /*
    Problem 5
    Return the next higher rank after the given rank.
    */
    public static Integer getNextRank(TreeMap<Integer, String> map, int rank) {
        return map.higherKey(rank); // returns null if no higher key exists
    }
}