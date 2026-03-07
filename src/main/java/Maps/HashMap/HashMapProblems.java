package Maps.HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapProblems {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        addItem(inventory, "Apples", 10);
        addItem(inventory, "Bananas", 5);
        addItem(inventory, "Oranges", 8);

        System.out.println("Inventory: " + inventory);

        System.out.println("Quantity of Apples: " + getQuantity(inventory, "Apples"));

        updateQuantity(inventory, "Bananas", 12);
        System.out.println("Updated Inventory: " + inventory);

        removeItem(inventory, "Oranges");
        System.out.println("After Removal: " + inventory);
    }

    /*
    Problem 1
    Add an item and its quantity to the map.
    */
    public static void addItem(Map<String, Integer> map, String item, int quantity) {

        map.put(item, quantity);

    }


    /*
    Problem 2
    Return the quantity of a specific item.
    */
    public static int getQuantity(Map<String, Integer> map, String item) {

        if (map.containsKey(item)) {
            return map.get(item);
        }

        return 0;
    }


    /*
    Problem 3
    Update the quantity of an existing item.
    */
    public static void updateQuantity(Map<String, Integer> map, String item, int newQuantity) {

        if (map.containsKey(item)) {
            map.put(item, newQuantity);
        }

    }


    /*
    Problem 4
    Remove an item from the map.
    */
    public static void removeItem(Map<String, Integer> map, String item) {

        map.remove(item);

    }


    /*
    Problem 5
    Count how many times each number appears in a list.
    */
    public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : numbers) {

            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else {
                frequency.put(num, 1);
            }

        }

        return frequency;
    }
}