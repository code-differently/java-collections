package Lists.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Creating an ArrayList
        List<String> students = new ArrayList<>();

        // Adding elements
        students.add("Jordan");
        students.add("Taylor");
        students.add("Morgan");
        students.add("Alex");

        System.out.println("Students: " + students);

        // Access element
        System.out.println("First student: " + students.get(0));

        // Update element
        students.set(2, "Chris");
        System.out.println("After update: " + students);

        // Remove element
        students.remove("Alex");
        System.out.println("After removal: " + students);

        // Size of list
        System.out.println("Total students: " + students.size());

        // Loop through ArrayList
        System.out.println("\nLooping through students:");

        for (String student : students) {
            System.out.println(student);
        }

        // Check if element exists
        if (students.contains("Jordan")) {
            System.out.println("\nJordan is in the list.");
        }
    }

}
