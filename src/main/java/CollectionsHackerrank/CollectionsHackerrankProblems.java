package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {
    public class CollectionsHackerrankPractice {

        public static void main(String[] args) {

           List<Integer> numbers = new ArrayList<>();

           numbers.add(1);
            numbers.add(2);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(5);

            System.out.println(removeDuplicates(numbers));

        }

        /*
        Problem 1
        Remove duplicates from a list of integers.

        Example
        Input: [1,2,2,3,4,4,5]
        Output: [1,2,3,4,5]
        */
        public static List<Integer> removeDuplicates(List<Integer> numbers) {

            Set<Integer> unique = new LinkedHashSet<>(numbers);

            return new ArrayList<>(unique);
        }

        /*
        Problem 2
        Count how many times each number appears.

        Example
        Input: [1,2,2,3,3,3]
        Output: {1=1, 2=2, 3=3}
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {

            // TODO: Implement this method

            //Had chat help me understand this I will try and do something over the weekend like this.

            // Create a HashMap to store the results
            // Key = the number from the list
            // Value = how many times that number appears
            Map<Integer, Integer> frequency = new HashMap<>();

            // Loop through every number inside the list
            for (int num : numbers) {

                // Check if the number already exists in the map
                // containsKey(num) asks: "Have we seen this number before?"
                if (frequency.containsKey(num)) {

                    // If the number is already in the map:
                    // Get its current count and add 1 to it
                    // Example:
                    // If map has {2=1} and we see another 2
                    // It becomes {2=2}
                    frequency.put(num, frequency.get(num) + 1);

                } else {

                    // If the number is NOT in the map yet
                    // This means we are seeing it for the first time
                    // So we add it with a starting count of 1
                    // Example: {3=1}
                    frequency.put(num, 1);
                }

            }

            // After the loop finishes, the map contains
            // every number and how many times it appeared
            // Example: {1=1, 2=2, 3=3}
            return frequency;
        }

        /*
        Problem 3
        Return the first number that appears only once.

        Example
        Input: [4,5,1,2,0,4]
        Output: 5
        */
        public static Integer firstUnique(List<Integer> numbers) {

            // TODO: Implement this method

            // Map to store how many times each number appears
            Map<Integer, Integer> frequency = new HashMap<>();

            // First loop: count each number
            for (int num : numbers) {

                if (frequency.containsKey(num)) {
                    frequency.put(num, frequency.get(num) + 1);
                } else {
                    frequency.put(num, 1);
                }

            }

            // Second loop: find the first number that appears only once
            for (int num : numbers) {

                if (frequency.get(num) == 1) {
                    return num;
                }

            }

            // If no unique number exists
            return null;
        }

        /*
        Problem 4
        Return true if any two numbers add up to the target.

        Example
        numbers = [2,7,11,15]
        target = 9

        Output: true
        */
        public static boolean twoSum(List<Integer> numbers, int target) {

            // TODO: Implement this method

            return false;
        }

        /*
        Problem 5
        Count how many unique words exist in a list.

        Example
        Input: ["apple","banana","apple","orange"]
        Output: 3
        */
        public static int countUniqueWords(List<String> words) {

            // TODO: Implement this method

            return 0;
        }

        /*
        Problem 6
        Reverse a queue.

        Example
        Input: [1,2,3,4]
        Output: [4,3,2,1]
        */
        public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

            // TODO: Implement this method

            return null;
        }

        /*
        Problem 7
        Determine whether parentheses are balanced.

        Example
        Input: "(())"
        Output: true

        Input: "(()"
        Output: false
        */
        public static boolean isBalanced(String expression) {

            // TODO: Implement this method

            return false;
        }

        /*
        Problem 8
        Return the number that appears most frequently in the list.

        Example
        Input: [1,3,2,3,4,3]
        Output: 3
        */
        public static Integer mostFrequent(List<Integer> numbers) {

            // TODO: Implement this method

            return null;
        }

        /*
        Problem 9
        Group words based on their length.

        Example
        Input: ["cat","dog","elephant","ant"]

        Output:
        {
          3 = ["cat","dog","ant"],
          8 = ["elephant"]
        }
        */
        public static Map<Integer, List<String>> groupByLength(List<String> words) {

            // TODO: Implement this method

            return null;
        }

        /*
        Problem 10
        Return the maximum sum of any window of size k.

        Example
        numbers = [2,1,5,1,3,2]
        k = 3

        Output: 9
        */
        public static int maxSlidingWindowSum(List<Integer> numbers, int k) {

            // TODO: Implement this method

            return 0;
        }
    }
}
