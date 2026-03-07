package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {
        public static void main(String[] args) {

            // You can test your methods here
            // Problem 1 Test
            List<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
            System.out.println("Remove Duplicates: " + removeDuplicates(nums1));

            // Problem 2 Test
            List<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,2,3,3,3));
            System.out.println("Count Frequency: " + countFrequency(nums2));

            // Problem 3 Test
            List<Integer> nums3 = new ArrayList<>(Arrays.asList(4,5,1,2,0,4));
            System.out.println("First Unique: " + firstUnique(nums3));

            // Problem 4 Test
            List<Integer> nums4 = new ArrayList<>(Arrays.asList(2,7,11,15));
            int target = 9;
            System.out.println("Two Sum Exists: " + twoSum(nums4, target));

            // Problem 5 Test
            List<String> words1 = new ArrayList<>(Arrays.asList("apple","banana","apple","orange"));
            System.out.println("Unique Words Count: " + countUniqueWords(words1));

            // Problem 6 Test
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);

            System.out.println("Original Queue: " + queue);
            System.out.println("Reversed Queue: " + reverseQueue(queue));

            // Problem 7 Test
            String expr1 = "(())";
            String expr2 = "(()";
            System.out.println("Is Balanced ( (()) ): " + isBalanced(expr1));
            System.out.println("Is Balanced ( (() ): " + isBalanced(expr2));

            // Problem 8 Test
            List<Integer> nums5 = new ArrayList<>(Arrays.asList(1,3,2,3,4,3));
            System.out.println("Most Frequent: " + mostFrequent(nums5));

            // Problem 9 Test
            List<String> words2 = new ArrayList<>(Arrays.asList("cat","dog","elephant","ant"));
            System.out.println("Group by Length: " + groupByLength(words2));

            // Problem 10 Test
            List<Integer> nums6 = new ArrayList<>(Arrays.asList(2,1,5,1,3,2));
            int k = 3;
            System.out.println("Max Sliding Window Sum: " + maxSlidingWindowSum(nums6, k));

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
            HashSet<Integer> set = new HashSet<>(numbers);

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
            for (Integer number : numbers) {
                map.put(number, map.getOrDefault(number, 0) + 1);
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
            for (Integer number : numbers) {
                map.put(number, map.getOrDefault(number, 0) + 1);

            }
            // next, return the first key that value = 1
            // num = numbers list
            // 4 insert key check value, no.
            // 5 Insert key check value, yes.
            for (Integer num : numbers){
                if(map.get(num) == 1){
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
            HashSet<Integer> set = new HashSet<>();

            int complement = 0;

            for (Integer num : numbers) {
                complement = target - num;

                if (set.contains(complement)) {
                    return true;
                }

                set.add(num);

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
            HashSet<String> set = new HashSet<>(words);

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
            Queue<Integer> reverse = new ArrayDeque<>();
            while (!(queue.isEmpty())) {
                stack.push(queue.poll());

            }
            while (!(stack.isEmpty())){
                reverse.add(stack.pop());
            }
            return reverse;

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
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    stack.push(ch);
                }
                else if (ch == ')') {
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
            int max = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(Integer num : numbers){
                map.put(num, map.getOrDefault(num, 0)+1);
                max = Math.max(max, map.get(num));
            }

            for(Integer number: numbers){

                if (max == map.get(number)){
                    return number;
                }
            }

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
            HashMap<Integer, List<String>> map = new HashMap<>();
            for(String word : words){
                Integer length = word.length();

                if(!(map.containsKey(length))){
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

            // 2) slide the window
            for (int right = k; right < numbers.size(); right++) {
                int left = right - k;                 // index leaving the window
                windowSum = windowSum - numbers.get(left) + numbers.get(right);
                maxSum = Math.max(maxSum, windowSum);
            }

            return maxSum;

        }
    }

