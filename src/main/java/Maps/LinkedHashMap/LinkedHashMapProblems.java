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
        map.put(name, grade);
    }
        Map<String, Integer> students = new LinkedHashMap<>();

        addStudent(students, "Jordan", 90);
        addStudent(students, "Alex", 85);

        System.out.println(students);
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
        // Update only if the student exists
        if (map.containsKey(name)) {
            map.put(name, newGrade);
        }


        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("Taylor", 85);

        updateGrade(students, "Taylor", 92);

        System.out.println(students);
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
    Map<String, Integer> students = new LinkedHashMap<>();
students.put("Morgan", 88);
students.put("Jordan", 90);

    removeStudent(students, "Morgan");

System.out.println(students);
    /*
    Problem 4
    Return the first student inserted into the LinkedHashMap.

    Example
    Input: {"Jordan"=90, "Taylor"=85}
    Output: "Jordan"
    */

import java.util.Map;
import java.util.LinkedHashMap;

    public class Main {
        public static String getFirstInserted(Map<String, Integer> map) {
            // LinkedHashMap preserves insertion order
            if (map == null || map.isEmpty()) {
                return null; // handle empty map
            }

            // Iterate over keys and return the first one
            for (String key : map.keySet()) {
                return key;
            }

            return null; // fallback, though it should never reach here
        }

        public static void main(String[] args) {
            Map<String, Integer> students = new LinkedHashMap<>();
            students.put("Jordan", 90);
            students.put("Taylor", 85);

            System.out.println(getFirstInserted(students)); // Output: Jordan
        }
    }
    /*
    Problem 5
    Given a list of words, return a LinkedHashMap that counts
    how many times each word appears while preserving insertion order.

    Example
    Input: ["apple","banana","apple","orange"]
    Output: {apple=2, banana=1, orange=1}
    */
   import java.util.*;

    public class Main {

        public static Map<String, Integer> wordFrequency(List<String> words) {
            Map<String, Integer> frequencyMap = new LinkedHashMap<>();

            if (words == null) return frequencyMap; // handle null input

            for (String word : words) {
                // If the word is already in the map, increment count; otherwise, set to 1
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }

            return frequencyMap;
        }

        public static void main(String[] args) {
            List<String> words = Arrays.asList("apple","banana","apple","orange");
            Map<String, Integer> result = wordFrequency(words);
            System.out.println(result); // Output: {apple=2, banana=1, orange=1}
        }
    }