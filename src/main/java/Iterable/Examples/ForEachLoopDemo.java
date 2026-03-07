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
for(String n:students){
    System.out.println(n);
}

        System.out.println("\nPrinting students in uppercase:");

        // TODO:
        // Use a for-each loop to print each name in uppercase
        for(String n:students){
            System.out.println(n.toUpperCase()).

        System.out.println("\nCount the number of students:");

        int count = 0;

        // TODO:
        // Use a for-each loop to count how many students are in the list
            for(String n:students){
                count +=n;
            }

        System.out.println("Total students: " + count);
    }
}
