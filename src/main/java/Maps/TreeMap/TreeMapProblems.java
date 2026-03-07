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


        // TODO: Implement this method
       // TreeMap, adding a key-value pair is just like a regular map using put().
        // Since TreeMap automatically sorts keys, the map will stay sorted by rank.

import java.util.TreeMap;

        public static void addPlayer(TreeMap<Integer, String> map, int rank, String name) {
            map.put(rank, name);
        }


    /*
    Problem 2
    Return the player with the highest ranking (smallest key).

    Example
    Input: {1="Jordan", 2="Taylor"}
    Output: "Jordan"
    */


        // TODO: Implement this method
          //  TreeMap, the smallest key can be retrieved with firstKey(), and then you can get the corresponding value.

import java.util.TreeMap;

            public static String getTopPlayer(TreeMap<Integer, String> map) {
                if (map.isEmpty()) {
                    return null; // or throw exception if you prefer
                }
                return map.get(map.firstKey());
            }
    /*
    Problem 3
    Return the player with the lowest ranking (largest key).

    Example
    Input: {1="Jordan", 2="Taylor"}
    Output: "Taylor"
    */


            //    TreeMap, the largest key can be retrieved with lastKey(), and then you get the corresponding value.

import java.util.TreeMap;

                public static String getLowestPlayer(TreeMap<Integer, String> map) {
                    if (map.isEmpty()) {
                        return null; // or throw exception if you prefer
                    }
                    return map.get(map.lastKey());
                }

    /*
    Problem 4
    Remove a player based on their rank.

    Example
    Input: remove rank 2
    Output: player removed
    */


        // TODO: Implement this method
      //  TreeMap, you can remove a key-value pair using the remove() method with the key (rank).

import java.util.TreeMap;

        public static void removePlayer(TreeMap<Integer, String> map, int rank) {
            if (map.containsKey(rank)) {
                map.remove(rank);
                System.out.println("Player with rank " + rank + " removed.");
            } else {
                System.out.println("No player found with rank " + rank + ".");
            }
        }

    /*
    Problem 5
    Return the next higher rank after the given rank.

    Example
    Input: rank=2, map={1="A",2="B",3="C"}
    Output: 3
    */

        // TODO: Implement this method

       // In a TreeMap, we can use higherKey(key) to get the smallest key strictly greater than the given key. That’s exactly what we need for the next higher rank.

import java.util.TreeMap;

        public static Integer getNextRank(TreeMap<Integer, String> map, int rank) {
            return map.higherKey(rank); // returns null if no higher key exists
        }

        //higherKey(key) → next higher key
//lowerKey(key) → next lower key
//ceilingKey(key) → smallest key ≥ given key
//floorKey(key) → largest key ≤ given key