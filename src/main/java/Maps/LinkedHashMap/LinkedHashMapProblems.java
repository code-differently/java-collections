package Maps.LinkedHashMap;

import java.util.*;

public class LinkedHashMapProblems {
    public static void main(String[] args) {

        Map<String, Integer> studentGrades = new LinkedHashMap<>();

        addStudent(studentGrades, "Jordan", 90);
        addStudent(studentGrades, "Taylor", 85);
        addStudent(studentGrades, "Morgan", 88);

        System.out.println("Students: " + studentGrades);

        updateGrade(studentGrades, "Taylor", 92);
        System.out.println("Updated Grades: " + studentGrades);

        removeStudent(studentGrades, "Morgan");
        System.out.println("After Removal: " + studentGrades);
    }

    /*
    Problem 1
    Add a student and their grade to the LinkedHashMap.

    Example
    Input: ("Jordan", 90)
    Output: {"Jordan"=90}
    */
    public static void addStudent(Map<String, Integer> map, String name, int grade) {

        // TODO: Implement this method
        map.put(name,grade);

    }

    /*
    Problem 2
    Update the grade of an existing student.

    Example
    Input: ("Taylor", 92)
    Output: {"Taylor"=92}
    */
    public static void updateGrade(Map<String, Integer> map, String name, int newGrade) {

        // TODO: Implement this method
        map.put(name,newGrade);

    }

    /*
    Problem 3
    Remove a student from the LinkedHashMap.

    Example
    Input: ("Morgan")
    Output: Student removed from map
    */
    public static void removeStudent(Map<String, Integer> map, String name) {

        // TODO: Implement this method
        map.remove(name);

    }

    /*
    Problem 4
    Return the first student inserted into the LinkedHashMap.

    Example
    Input: {"Jordan"=90, "Taylor"=85}
    Output: "Jordan"
    */
    public static String getFirstInserted(Map<String, Integer> map) {
        // TODO: Implement this method
        Set<String> keys = map.keySet();

        Iterator<String> iterator = keys.iterator();
        return iterator.next();
    }

    /*
    Problem 5
    Given a list of words, return a LinkedHashMap that counts
    how many times each word appears while preserving insertion order.

    Example
    Input: ["apple","banana","apple","orange"]
    Output: {apple=2, banana=1, orange=1}
    */
    public static Map<String, Integer> wordFrequency(List<String> words) {

        // TODO: Implement this method
        Map<String, Integer> frequent = new LinkedHashMap<>();

        for(String items : words){
            frequent.put(items,frequent.getOrDefault(items, 0)+1);
        }

        return frequent;
    }
}
