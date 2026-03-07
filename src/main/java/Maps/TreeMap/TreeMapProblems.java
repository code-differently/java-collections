package Maps.TreeMap;

import java.util.TreeMap;

public class TreeMapProblems {
    public static void main(String[] args) {


    }
    /*
Problem 1
Add a player to the TreeMap with their rank.
*/
    public static void addPlayer(TreeMap<Integer, String> map, int rank, String name) {

        // add rank as key and player name as value
        map.put(rank, name);
    }

    /*
    Problem 2
    Return the player with the highest ranking (smallest key).
    */
    public static String getTopPlayer(TreeMap<Integer, String> map) {

        // get value of the first (smallest) key
        return map.get(map.firstKey());
    }

    /*
    Problem 3
    Return the player with the lowest ranking (largest key).
    */
    public static String getLowestPlayer(TreeMap<Integer, String> map) {

        // get value of the last (largest) key
        return map.get(map.lastKey());
    }

    /*
    Problem 4
    Remove a player based on their rank.
    */
    public static void removePlayer(TreeMap<Integer, String> map, int rank) {

        // remove player with that rank
        map.remove(rank);

        System.out.println("player removed");
    }

    /*
    Problem 5
    Return the next higher rank after the given rank.
    */
    public static Integer getNextRank(TreeMap<Integer, String> map, int rank) {

        // returns the next higher key
        return map.higherKey(rank);
    }
}