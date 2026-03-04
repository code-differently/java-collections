package Lists.LinkedLists;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Adding elements
        tasks.add("Check emails");
        tasks.add("Review pull requests");
        tasks.add("Write documentation");

        System.out.println("Tasks: " + tasks);

        // Add to beginning
        tasks.addFirst("Morning standup");

        // Add to end
        tasks.addLast("End of day report");

        System.out.println("Updated Tasks: " + tasks);

        // Access first and last elements
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());

        // Remove first element
        tasks.removeFirst();

        // Remove last element
        tasks.removeLast();

        System.out.println("After removals: " + tasks);

        // Loop through LinkedList
        System.out.println("\nIterating through tasks:");

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
