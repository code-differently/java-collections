package Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

        System.out.println("First inserted student: " + getFirstInserted(studentGrades));

        List<String> words = List.of("apple","banana","apple","orange");
        System.out.println("Word Frequencies: " + wordFrequency(words));
    }

    /*
    Problem 1
    Add a student and their grade to the LinkedHashMap.
    */
    public static void addStudent(Map<String, Integer> map, String name, int grade) {
        map.put(name, grade);
    }

    /*
    Problem 2
    Update the grade of an existing student.
    */
    public static void updateGrade(Map<String, Integer> map, String name, int newGrade) {
        if(map.containsKey(name)) {
            map.put(name, newGrade);
        }
    }

    /*
    Problem 3
    Remove a student from the LinkedHashMap.
    */
    public static void removeStudent(Map<String, Integer> map, String name) {
        map.remove(name);
    }

    /*
    Problem 4
    Return the first student inserted into the LinkedHashMap.
    */
    public static String getFirstInserted(Map<String, Integer> map) {
        if(map.isEmpty()) return null;
        return map.keySet().iterator().next();
    }

    /*
    Problem 5
    Return a LinkedHashMap counting word frequencies while preserving insertion order.
    */
    public static Map<String, Integer> wordFrequency(List<String> words) {
        Map<String, Integer> freqMap = new LinkedHashMap<>();
        for(String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        return freqMap;
    }
}