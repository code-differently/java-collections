package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {

    public static void main(String[] args) {

        // Problem 1
        System.out.println("Problem 1 - Remove Duplicates");
        System.out.println(removeDuplicates(new ArrayList<>(List.of(1,2,2,3,4,4,5))));
        // Expected: [1,2,3,4,5]

        // Problem 2
        System.out.println("\nProblem 2 - Count Frequency");
        System.out.println(countFrequency(new ArrayList<>(List.of(1,2,2,3,3,3))));
        // Expected: {1=1, 2=2, 3=3}

        // Problem 3
        System.out.println("\nProblem 3 - First Unique");
        System.out.println(firstUnique(new ArrayList<>(List.of(4,5,1,2,0,4))));
        // Expected: 5

        // Problem 4
        System.out.println("\nProblem 4 - Two Sum");
        System.out.println(twoSum(new ArrayList<>(List.of(2,7,11,15)), 9));
        System.out.println(twoSum(new ArrayList<>(List.of(2,8,11,15)), 9));
        // Expected: true, false

        // Problem 5
        System.out.println("\nProblem 5 - Count Unique Words");
        System.out.println(countUniqueWords(new ArrayList<>(List.of("apple","banana","apple","orange"))));
        // Expected: 3

        // Problem 6
        System.out.println("\nProblem 6 - Reverse Queue");
        Queue<Integer> queue = new LinkedList<>(List.of(1,2,3,4));
        System.out.println(reverseQueue(queue));
        // Expected: [4,3,2,1]

        // Problem 7
        System.out.println("\nProblem 7 - Balanced Parentheses");
        System.out.println(isBalanced("(())"));
        // Expected: true
        System.out.println(isBalanced("(()"));
        // Expected: false

        // Problem 8
        System.out.println("\nProblem 8 - Most Frequent");
        System.out.println(mostFrequent(new ArrayList<>(List.of(1,3,2,3,4,3))));
        // Expected: 3

        // Problem 9
        System.out.println("\nProblem 9 - Group By Length");
        System.out.println(groupByLength(new ArrayList<>(List.of("cat","dog","elephant","ant"))));
        // Expected: {3=[cat,dog,ant], 8=[elephant]}

        // Problem 10
        System.out.println("\nProblem 10 - Max Sliding Window Sum");
        System.out.println(maxSlidingWindowSum(new ArrayList<>(List.of(2,1,5,1,3,2)), 3));
        // Expected: 9
    }

        /*
        Problem 1
        Remove duplicates from a list of integers.

        Example
        Input: [1,2,2,3,4,4,5]
        Output: [1,2,3,4,5]
        */
        public static List<Integer> removeDuplicates(List<Integer> numbers) {
            return new ArrayList<>(new LinkedHashSet<>(numbers));
        }

        /*
        Problem 2
        Count how many times each number appears.

        Example
        Input: [1,2,2,3,3,3]
        Output: {1=1, 2=2, 3=3}
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {
            Map<Integer, Integer> answer = new HashMap<>();
            for (Integer num : numbers) {
                if (answer.containsKey(num)) {
                    int value = answer.get(num);
                    answer.replace(num, value + 1);
                } else {
                    answer.put(num, 1);
                }
            }
            return answer;
        }

        /*
        Problem 3
        Return the first number that appears only once.

        Example
        Input: [4,5,1,2,0,4]
        Output: 5
        */
        public static Integer firstUnique(List<Integer> numbers) {
            LinkedHashMap<Integer, Integer> answer = new LinkedHashMap<>();
            for (Integer num : numbers) {
                if (answer.containsKey(num)) {
                    int value = answer.get(num);
                    answer.replace(num, value + 1);
                } else {
                    answer.put(num, 1);
                }
            }
            for (Integer key : answer.keySet()) {
                if (answer.get(key) == 1) {
                    return key;
                }
            }
            return 0;
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
            for (int i = 0; i < numbers.size() - 1; i++) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (numbers.get(i) + numbers.get(j) == target) {
                        return true;
                    }
                }
            }
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
            Set<String> unique = new HashSet<>(new HashSet<>(words));
            return unique.size();
        }

        /*
        Problem 6
        Reverse a queue.

        Example
        Input: [1,2,3,4]
        Output: [4,3,2,1]
        */
        public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
            Queue<Integer> answer = new ArrayDeque<>();
            while (!answer.isEmpty()) {
                reverseQueue(queue);
                answer.add(queue.remove());
            }
            return answer;
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
            int windowStart = 0;
            int windowEnd = k;
            int max = Integer.MIN_VALUE;
            while (k != numbers.size()) {
                for (int i = windowStart; i < k; i++) {

                }
            }
            return 0;
         }
}
