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

    Example
    Input: ("Apples", 10)
    Output: {"Apples"=10}
    */
    public static void addItem(Map<String, Integer> map, String item, int quantity) {
        map.put(item, quantity);
    }

    /*
    Problem 2
    Return the quantity of a specific item.

    Example
    Input: ("Apples")
    Output: 10
    */
    public static int getQuantity(Map<String, Integer> map, String item) {
        return map.get(item);
    }

    /*
    Problem 3
    Update the quantity of an existing item.

    Example
    Input: ("Bananas", 12)
    Output: {"Bananas"=12}
    */
    public static void updateQuantity(Map<String, Integer> map, String item, int newQuantity) {
        map.replace(item, newQuantity);
    }

    /*
    Problem 4
    Remove an item from the map.

    Example
    Input: ("Oranges")
    Output: item removed
    */
    public static void removeItem(Map<String, Integer> map, String item) {
        map.remove(item);
    }

    /*
    Problem 5
    Count how many times each number appears in a list.

    Example
    Input: [1,2,2,3,3,3]
    Output: {1=1, 2=2, 3=3}
    */
    public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {
        Map<Integer, Integer> answer = new HashMap<>();
        for (int num : numbers) {
            if (answer.containsKey(num)) {
                int value = answer.get(num);
                answer.replace(num, value + 1);
            } else {
                answer.put(num, 1);
            }
        }
        return answer;
    }
}
