package CollectionsHackerrank;

import java.security.Key;
import java.util.*;

public class CollectionsHackerrankProblems {
        public static void main(String[] args) {

            // ---------- Problem 1: Remove duplicates ----------
            System.out.println("Problem 1: Remove duplicates");
            List<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
            System.out.println("Before: " + nums1);
            System.out.println("After:  " + removeDuplicates(new ArrayList<>(nums1)));
            System.out.println();

            // ---------- Problem 2: Count frequency ----------
            System.out.println("Problem 2: Count frequency");
            List<Integer> nums2 = Arrays.asList(1,2,2,3,3,3);
            System.out.println("Input: " + nums2);
            System.out.println("Frequency: " + countFrequency(nums2));
            System.out.println();

            // ---------- Problem 3: First unique ----------
            System.out.println("Problem 3: First unique");
            List<Integer> nums3 = Arrays.asList(4,5,1,2,0,4);
            System.out.println("Input: " + nums3);
            System.out.println("First unique: " + firstUnique(nums3));
            System.out.println();

            // ---------- Problem 4: Two sum ----------
            System.out.println("Problem 4: Two sum");
            List<Integer> nums4 = Arrays.asList(2,7,11,15);
            int target = 9;
            System.out.println("Numbers: " + nums4 + ", Target: " + target);
            System.out.println("Two sum exists? " + twoSum(nums4, target));
            System.out.println();

            // ---------- Problem 5: Count unique words ----------
            System.out.println("Problem 5: Count unique words");
            List<String> words = Arrays.asList("apple","banana","apple","orange");
            System.out.println("Input: " + words);
            System.out.println("Unique count: " + countUniqueWords(words));
            System.out.println();

            // ---------- Problem 6: Reverse queue ----------
            System.out.println("Problem 6: Reverse queue");
            Queue<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4));
            System.out.println("Before: " + queue);
            System.out.println("After:  " + reverseQueue(new LinkedList<>(queue)));
            System.out.println();

            // ---------- Problem 7: Balanced parentheses ----------
            System.out.println("Problem 7: Balanced parentheses");
            String expr1 = "(())";
            String expr2 = "(()";
            System.out.println("Expression: " + expr1 + ", Balanced? " + isBalanced(expr1));
            System.out.println("Expression: " + expr2 + ", Balanced? " + isBalanced(expr2));
            System.out.println();

            // ---------- Problem 8: Most frequent ----------
            System.out.println("Problem 8: Most frequent");
            List<Integer> nums8 = Arrays.asList(1,3,2,3,4,3);
            System.out.println("Input: " + nums8);
            System.out.println("Most frequent: " + mostFrequent(nums8));
            System.out.println();

            // ---------- Problem 9: Group by word length ----------
            System.out.println("Problem 9: Group words by length");
            List<String> words9 = Arrays.asList("cat","dog","elephant","ant");
            System.out.println("Input: " + words9);
            System.out.println("Grouped: " + groupByLength(words9));
            System.out.println();

            // ---------- Problem 10: Max sliding window sum ----------
            System.out.println("Problem 10: Max sliding window sum");
            List<Integer> nums10 = Arrays.asList(2,1,5,1,3,2);
            int k = 3;
            System.out.println("Numbers: " + nums10 + ", Window size: " + k);
            System.out.println("Max sum: " + maxSlidingWindowSum(nums10, k));
            System.out.println();
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
           ArrayList<Integer> seen = new ArrayList<>();
            for (Integer number:numbers){
                if (!seen.contains(number)){
                    seen.add(number);
                }
            }
            return seen;
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
            for (Integer number:numbers){
                if (!map.containsKey(number)){
                    map.put(number,1);
                }
                else{
                    int counter = map.get(number);
                    map.put(number, ++counter);
                }
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
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer number:numbers){
                if (!map.containsKey(number)){
                    map.put(number, 1);
                }
                else{
                    int counter = map.get(number);
                    map.put(number, counter++);
                }
            }

            int unique = 0;
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (entry.getValue()==1){
                    unique = entry.getKey();
                }
            }
            return unique;
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

            Set<Integer> seen = new HashSet<>();
            for (int num : numbers) {
                if (seen.contains(target-num)) {
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

            Set<String> unique = new HashSet<>();

            for (String word : words) {
                unique.add(word);
            }

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
            Stack<Integer> stack = new Stack<>();
            while (!queue.isEmpty()) {
                stack.push(queue.remove());
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

            Map<Integer, Integer> map = new HashMap<>();
            for (int num : numbers) {
                if (!map.containsKey(num)) {
                    map.put(num, 1);
                } else {
                    map.put(num, map.get(num) + 1);
                }
            }

            int maxCount = 0;
            int result = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

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

            int maxSum = 0;
            int windowSum = 0;

            for (int i = 0; i < k; i++) {
                windowSum += numbers.get(i);
            }

            maxSum = windowSum;

            for (int i = k; i < numbers.size(); i++) {

                windowSum += numbers.get(i);
                windowSum -= numbers.get(i - k);

                maxSum = Math.max(maxSum, windowSum);
            }

            return maxSum;
        }
    }

