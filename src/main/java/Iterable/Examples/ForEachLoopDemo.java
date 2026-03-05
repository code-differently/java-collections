package Iterable.Examples;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Alex");
        students.add("Jordan");
        students.add("Taylor");
        students.add("Morgan");

        System.out.println("Printing students using a for-each loop:");

        // TODO:
        for (String student: students) {
            System.out.println(student);

        }

        // Use a for-each loop to print each student name


        System.out.println("\nPrinting students in uppercase:");

        // TODO:
        for (String student: students){
            System.out.println(student.toUpperCase());
        }

        // Use a for-each loop to print each name in uppercase


        System.out.println("\nCount the number of students:");

        int count = 0;

        // TODO: increment the count variable inside the loop.
        for (String student : students){
            count++;
        }
        // Use a for-each loop to count how many students are in the list

        System.out.println("Total students: " + count);
    }
}
