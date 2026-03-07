package CollectionsHackerrank;
import  java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CollectionsHackerrankProblems {
    public class CollectionsHackerrankPractice {

        public static void main(String[] args) {

            // You can test your methods here

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
            // TODO: Implement this method
            Map<Integer, Integer> frequency = new HashMap<>();

            for (Integer num : numbers) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }

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
            Map<Integer, Integer> frequency = countFrequency(numbers);

            for (Integer num : numbers) {
                if (frequency.get(num) == 1) {
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
            return new HashSet<>(words).size();
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
                queue.add(stack.pop());
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

            for (char c : expression.toCharArray()) {

                if (c == '(') {
                    stack.push(c);
                }

                if (c == ')') {

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
            Map<Integer, Integer> frequency = countFrequency(numbers);

            int maxCount = 0;
            Integer result = null;

            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {

                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    result = entry.getKey();
                }
            }

            return result;
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

                map.putIfAbsent(length, new ArrayList<>());

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
            int maxSum = 0;
            int windowSum = 0;

            for (int i = 0; i < numbers.size(); i++) {

                windowSum += numbers.get(i);

                if (i >= k - 1) {

                    maxSum = Math.max(maxSum, windowSum);

                    windowSum -= numbers.get(i - k + 1);
                }
            }

            return maxSum;
        }
    }
}
