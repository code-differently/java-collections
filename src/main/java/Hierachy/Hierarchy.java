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


        //challenge

        // LIST EXAMPLE
        List<String> listStudents = new ArrayList<>();
        listStudents.add("Alex");
        listStudents.add("Jonathan");
        listStudents.add("William");

        System.out.println("List Example:");
        for (String item : listStudents) {
            System.out.println(item);
        }

        System.out.println();

        // SET EXAMPLE
        Set<String> setCourses = new HashSet<>();
        setCourses.add("Math");
        setCourses.add("Reading");
        setCourses.add("Computer Science");


        System.out.println("Set Example:");
        for (String course : setCourses) {
            System.out.println(course);
        }

        System.out.println();

        // QUEUE EXAMPLE
        Queue<String> queueTask = new LinkedList<>();
        queueTask.offer("Finish Homework");
        queueTask.offer("Wash Dishes");
        queueTask.offer("Clean Bathroom");

        System.out.println("Queue Example:");
        while (!queueTask.isEmpty()) {
            System.out.println(queueTask.poll());
        }

        System.out.println();

        // MAP EXAMPLE
        Map<String, Integer> grade = new HashMap<>();
        grade.put("Alex", 90);
        grade.put("Jonathan", 85);
        grade.put("William", 95);

        System.out.println("Map Example:");

        for (Map.Entry<String, Integer> entry : grade.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        listStudents.add("Jeff");
        setCourses.add("Economics");
        queueTask.offer("Make Money");
        grade.put("Jeff", 25);

        System.out.println("List Example:");
        for (String item : listStudents) {
            System.out.println(item);
        }

        System.out.println("Set Example:");
        for (String course : setCourses) {
            System.out.println(course);
        }

        System.out.println("Queue Example:");
        while (!queueTask.isEmpty()) {
            System.out.println(queueTask.poll());
        }

        System.out.println("Map Example:");

        for (Map.Entry<String, Integer> entry : grade.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}



