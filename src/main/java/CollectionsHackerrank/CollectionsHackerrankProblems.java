package CollectionsHackerrank;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.*;

public class CollectionsHackerrankProblems {
    public static void main(String[] args) {
    // You can test your methods here
        testMethods();
}


    public static void testMethods() {
                List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

                System.out.println("Remove duplicates:");
                System.out.println(removeDuplicates(numbers));

                System.out.println("\nCount frequency:");
                System.out.println(countFrequency(Arrays.asList(1, 2, 2, 3, 3, 3)));

                System.out.println("\nFirst unique:");
                System.out.println(firstUnique(Arrays.asList(4, 5, 1, 2, 0, 4)));

                System.out.println("\nTwo Sum:");
                System.out.println(twoSum(Arrays.asList(2, 7, 11, 15), 9));

                System.out.println("\nUnique words:");
                System.out.println(countUniqueWords(Arrays.asList("apple", "banana", "apple", "orange")));
            }

        /*
        Problem 1
        Remove duplicates from a list of integers.

        Example
        Input: [1,2,2,3,4,4,5]
        Output: [1,2,3,4,5]
        */
        public static List<Integer> removeDuplicates(List<Integer> numbers) {

            // TODO: Implement this method
            Set<Integer> set = new LinkedHashSet<>(numbers);
            return new ArrayList<>(set);
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
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer num : numbers) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            return map;
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
            Map<Integer, Integer> freqMap = countFrequency(numbers);

            for (Integer num : numbers) {
                if (freqMap.get(num) == 1) {
                    return num;
                }
            }

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
            Set<Integer> seen = new HashSet<>();

            for (Integer num : numbers) {
                int complement = target - num;

                if (seen.contains(complement)) {
                    return true;
                }
                seen.add(num);
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

            // TODO: Implement this method
            Set<String> set = new HashSet<>(words);

            return set.size();
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
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            while (!stack.isEmpty()) {
                queue.offer(stack.pop());
            }

            return queue;
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

            Stack<Character> stack = new Stack<>();

            for (char ch : expression.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }

            return stack.isEmpty();
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
            Map<Integer, Integer> freqMap = countFrequency(numbers);

            int maxCount = 0;
            Integer mostFrequentNum = null;

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequentNum = entry.getKey();
                }
            }

            return mostFrequentNum;
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
            Map<Integer, List<String>> map = new HashMap<>();

            for (String word : words) {
                int length = word.length();

                if (!map.containsKey(length)) {
                    map.put(length, new ArrayList<>());
                }

                map.get(length).add(word);
            }

            return map;

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

            int windowSum = 0;

            for (int i = 0; i < k; i++) {
                windowSum += numbers.get(i);
            }

            int maxSum = windowSum;

            for (int i = k; i < numbers.size(); i++) {
                windowSum += numbers.get(i);
                windowSum -= numbers.get(i - k);
                maxSum = Math.max(maxSum, windowSum);
            }

            return maxSum;
        }

    }

