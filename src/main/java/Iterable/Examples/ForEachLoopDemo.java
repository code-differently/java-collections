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
    for (String x: students){
        System.out.println(x);

}

        System.out.println("\nPrinting students in uppercase:");
        for (String x: students){
            System.out.println(x.toUpperCase());
        }
        // TODO:
        // Use a for-each loop to print each name in uppercase


        System.out.println("\nCount the number of students:");

        int count = 0;
        for (String x: students){
            count=students.size();
        }
        // TODO:
        // Use a for-each loop to count how many students are in the list

        System.out.println("Total students: " + count);
    }
}
