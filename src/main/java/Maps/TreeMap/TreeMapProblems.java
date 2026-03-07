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
    }

    /*
    Problem 1
    Add a player to the TreeMap with their rank.

    Example
    Input: (1, "Jordan")
    Output: {1="Jordan"}
    */
    public static void addPlayer(TreeMap<Integer, String> map, int rank, String name) {

        // TODO: Implement this method
        map.put(rank, name);
    }



    /*
    Problem 2
    Return the player with the highest ranking (smallest key).

    Example
    Input: {1="Jordan", 2="Taylor"}
    Output: "Jordan"
    */
    public static String getTopPlayer(TreeMap<Integer, String> map) {

        // TODO: Implement this method

        return null;
    }

    /*
    Problem 3
    Return the player with the lowest ranking (largest key).

    Example
    Input: {1="Jordan", 2="Taylor"}
    Output: "Taylor"
    */
    public static String getLowestPlayer(TreeMap<Integer, String> map) {

        // TODO: Implement this method

        return null;
    }

    /*
    Problem 4
    Remove a player based on their rank.

    Example
    Input: remove rank 2
    Output: player removed
    */
    public static void removePlayer(TreeMap<Integer, String> map, int rank) {

        // TODO: Implement this method

    }

    /*
    Problem 5
    Return the next higher rank after the given rank.

    Example
    Input: rank=2, map={1="A",2="B",3="C"}
    Output: 3
    */
    public static Integer getNextRank(TreeMap<Integer, String> map, int rank) {

        // TODO: Implement this method

        return null;
    }
}
