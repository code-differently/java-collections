package CollectionsHackerrank;

import java.util.*;

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

            if (numbers == null || numbers.isEmpty()) {
                return new ArrayList<>();
            }

            LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

            // TODO: Implement this method

            return new ArrayList<>(uniqueNumbers);
        }

        /*
        Problem 2
        Count how many times each number appears.

        Example
        Input: [1,2,2,3,3,3]
        Output: {1=1, 2=2, 3=3}
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {
            if (numbers == null || numbers.isEmpty()) {
                return new HashMap<>();
            }

            // TODO: Implement this method

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int number : numbers) {
                frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
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

            if (numbers == null || numbers.isEmpty()) {
                return null;
            }
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int number : numbers) {
                frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            }
            for (int number : numbers) {
                if (frequencyMap.get(number) == 1) {
                    return number;
                }
            }

            // TODO: Implement this method

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
            if (numbers == null || numbers.isEmpty()) {

                // TODO: Implement this method

                return false;
            }
            HashSet<Integer> seenNumbers = new HashSet<>();
            for (int number : numbers) {
                int complement = target - number;

                if (seenNumbers.contains(complement)) {
                    return true;
                }

                seenNumbers.add(number);
            }
            return false;
        }
    }


        /*
        Problem 5
        Count how many unique words exist in a list.

        Example
        Input: ["apple","banana","apple","orange"]
        Output: 3
        */
        public static int countUniqueWords(List<String> words) {
            if (words == null || words.isEmpty()) {
                return 0;
            }
            HashSet<String> uniqueWords = new HashSet<>(words);

            // TODO: Implement this method

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
            if (queue == null || queue.isEmpty()) {
                return queue;
            }
            Stack<Integer> stack = new Stack<>();
            while (!queue.isEmpty()) {

                stack.push(queue.poll());
            }

            while (!stack.isEmpty()) {
                queue.offer(stack.pop());
            }

            // TODO: Implement this method

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
            if (expression == null || expression.isEmpty()) {
                return true;
            }

            Stack<Character> stack = new Stack<>();
            for (char c : expression.toCharArray()) {
                if (c == '(' || c == '{' || c == ']') {
                        stack.push(c);
                    } else if (c == ')' || c == '}' || c == ']') {
                        if (stack.isEmpty()) {
                            return false;

                    }
                        char top = stack.pop();
                        if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' &&
                                top != ']')) {
                            return false;
                        }
                }
            }

            // TODO: Implement this method

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

            Map<Integer, Integer> frequecyMap = new HashMap<>();
            for (Integer number : numbers) {

                frequecyMap.put(number, frequecyMap.getOrDefault(number, 0) + 1);

            }

            int mostFrequentNumber = 0;
            int maxFrequency = 0;
            boolean first = true;
            for (Map.Entry<Integer, Integer> entry : frequecyMap.entrySet()) {
                if (first) {
                    mostFrequentNumber = entry.getKey();
                    maxFrequency = entry.getValue();
                    first = false;
                } else if (entry.getValue() > maxFrequency) {
                    mostFrequentNumber = entry.getKey();
                    maxFrequency = entry.getValue();

                }
            }


            // TODO: Implement this method

            return mostFrequentNumber;
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
            Map<Integer, List<String>> lengthMap = new HashMap<>();

            for (String word : words) {
                int length = word.length();
                if (!lengthMap.containsKey(length)) {
                    lengthMap.put(length, new ArrayList<>());
                }

                lengthMap.get(length).add(word);
            }

            // TODO: Implement this method

            return lengthMap;
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

            int max_sum = Integer.MIN_VALUE;
            int current_window_sum = 0;

            for (int i = 0; i < k; i++) {
                current_window_sum += numbers.get(i);
            }
                max_sum = current_window_sum;

                for (int i = k; i < numbers.size(); i++) {
                    current_window_sum += numbers.get(i) - numbers.get(i - k);

                    max_sum = Math.max(max_sum, current_window_sum);
                }


            // TODO: Implement this method

            return max_sum;
        }
    }

