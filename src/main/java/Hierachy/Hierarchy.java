package Hierachy;

import java.util.*;

public class Hierarchy {
    public static void main(String[] args) {


        // LIST EXAMPLE
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List Example:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println();

        // SET EXAMPLE
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20); // duplicate ignored
        set.add(30);

        System.out.println("Set Example:");
        for (Integer num : set) {
            System.out.println(num);
        }

        System.out.println();

        // QUEUE EXAMPLE
        Queue<String> queue = new LinkedList<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Queue Example:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();

        // MAP EXAMPLE
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 95);

        System.out.println("Map Example:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
