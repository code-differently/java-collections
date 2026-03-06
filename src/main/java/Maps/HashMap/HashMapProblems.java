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

        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3);
        System.out.println("Frequency count: " + countFrequency(numbers));
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
        return map.getOrDefault(item, 0); // returns 0 if item does not exist
    }

    /*
    Problem 3
    Update the quantity of an existing item.
    */
    public static void updateQuantity(Map<String, Integer> map, String item, int newQuantity) {
        if(map.containsKey(item)) {
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
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(Integer num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }
}