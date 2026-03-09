package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {
    public static void run() {

        System.out.println("=== Maps Demo ===");

        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");

        hashMap.put(2, "Two");

        hashMap.put(3, "Three");

        System.out.println("HashMap: " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apples", 5);

        linkedHashMap.put("Bananas", 3);

        linkedHashMap.put("Oranges", 8);

        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30, "C");

        treeMap.put(10, "A");

        treeMap.put(20, "B");
        System.out.println("TreeMap: " + treeMap);

        System.out.println("hashMap.get(2): " + hashMap.get(2));
        System.out.println("hashMap.containsKey(3): " + hashMap.containsKey(3));

        System.out.println("Loop through HashMap:");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println();
    }
}