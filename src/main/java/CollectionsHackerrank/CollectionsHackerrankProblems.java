package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {
    public static class CollectionsHackerrankPractice {

        public static void main(String[] args) {
            // Example usage and testing can go here
        }

        /*
        Problem 1
        Remove duplicates from a list of integers.
        */
        public static List<Integer> removeDuplicates(List<Integer> numbers) {
            return new ArrayList<>(new LinkedHashSet<>(numbers));
        }

        /*
        Problem 2
        Count how many times each number appears.
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : numbers) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
            return freqMap;
        }

        /*
        Problem 3
        Return the first number that appears only once.
        */
        public static Integer firstUnique(List<Integer> numbers) {
            Map<Integer, Integer> freqMap = countFrequency(numbers);
            for (int num : numbers) {
                if (freqMap.get(num) == 1) return num;
            }
            return null;
        }

        /*
        Problem 4
        Return true if any two numbers add up to the target.
        */
        public static boolean twoSum(List<Integer> numbers, int target) {
            Set<Integer> seen = new HashSet<>();
            for (int num : numbers) {
                if (seen.contains(target - num)) return true;
                seen.add(num);
            }
            return false;
        }

        /*
        Problem 5
        Count how many unique words exist in a list.
        */
        public static int countUniqueWords(List<String> words) {
            return new HashSet<>(words).size();
        }

        /*
        Problem 6
        Reverse a queue.
        */
        public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();
            while (!queue.isEmpty()) stack.push(queue.poll());
            while (!stack.isEmpty()) queue.add(stack.pop());
            return queue;
        }

        /*
        Problem 7
        Determine whether parentheses are balanced.
        */
        public static boolean isBalanced(String expression) {
            Stack<Character> stack = new Stack<>();
            for (char c : expression.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) return false;
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }

        /*
        Problem 8
        Return the number that appears most frequently in the list.
        */
        public static Integer mostFrequent(List<Integer> numbers) {
            Map<Integer, Integer> freqMap = countFrequency(numbers);
            int maxCount = 0;
            Integer mostFreq = null;
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFreq = entry.getKey();
                }
            }
            return mostFreq;
        }

        /*
        Problem 9
        Group words based on their length.
        */
        public static Map<Integer, List<String>> groupByLength(List<String> words) {
            Map<Integer, List<String>> map = new HashMap<>();
            for (String word : words) {
                int len = word.length();
                map.computeIfAbsent(len, k -> new ArrayList<>()).add(word);
            }
            return map;
        }

        /*
        Problem 10
        Return the maximum sum of any window of size k.
        */
        public static int maxSlidingWindowSum(List<Integer> numbers, int k) {
            if (numbers == null || numbers.size() < k) return 0;
            int maxSum = 0;
            int windowSum = 0;

            // initial window sum
            for (int i = 0; i < k; i++) {
                windowSum += numbers.get(i);
            }
            maxSum = windowSum;

            for (int i = k; i < numbers.size(); i++) {
                windowSum += numbers.get(i) - numbers.get(i - k);
                maxSum = Math.max(maxSum, windowSum);
            }
            return maxSum;
        }
    }
}