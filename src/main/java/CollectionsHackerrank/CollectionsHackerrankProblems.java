package CollectionsHackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


public class CollectionsHackerrankProblems {
    public static class CollectionsHackerrankPractice {

        public static void main(String[] args) {

            // You can test your methods here
            List<Integer> numbers = Arrays.asList(1,2,2,3,4,4,5);
            System.out.println(removeDuplicates(numbers));
        }



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
            Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers); // removes duplicates
            List<Integer> result = new ArrayList<>(uniqueNumbers);




            return result;

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
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (Integer num : numbers) {
                if (frequencyMap.containsKey(num)) {
                    frequencyMap.put(num, frequencyMap.get(num) + 1);
                } else {
                    frequencyMap.put(num, 1);
                }
            }

            return frequencyMap;
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
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (Integer num : numbers) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            for (Integer num : numbers) {
                if (frequencyMap.get(num) == 1) {
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

            for (int num : numbers) {
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
            Set<String> uniqueWords = new HashSet<>();

            for (String word : words) {
                uniqueWords.add(word);
            }

            return uniqueWords.size();
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

            // Move elements from queue to stack
            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            // Move elements back to queue
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
                else if (c == ')') {

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
            Map<Integer, Integer> frequency = new HashMap<>();

            for (Integer num : numbers) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }

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

            // First window
            for (int i = 0; i < k; i++) {
                windowSum += numbers.get(i);
            }

            int maxSum = windowSum;

            // Slide the window
            for (int i = k; i < numbers.size(); i++) {
                windowSum += numbers.get(i);       // add next
                windowSum -= numbers.get(i - k);   // remove previous
                maxSum = Math.max(maxSum, windowSum);
            }

            return maxSum;
        }



    }

