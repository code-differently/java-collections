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
        // Use a for-each loop to print each student name
        for(String student : students){
            System.out.println(student);
        }

        System.out.println("\nPrinting students in uppercase:");

        // TODO:
        // Use a for-each loop to print each name in uppercase
        for(String student : students){
            System.out.println(student.toUpperCase());
        }

        System.out.println("\nCount the number of students:");

        int count = 0;

        // TODO:
        // Use a for-each loop to count how many students are in the list
        for(String student : students){
            count++;
        }
        System.out.println("Total students: " + count);
    }
}
