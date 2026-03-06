package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {
    public class CollectionsHackerrankPractice {

        public static void main(String[] args) {

            // You can test your methods here
            System.out.println(removeDuplicates(Arrays.asList(1,2,2,3,4,4,5)));
            System.out.println(countFrequency(Arrays.asList(1,2,2,3,4,4,5)));

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
            Map<Integer, Integer> map = new HashMap<>();

            for (Integer number : numbers) {
                if (map.containsKey(number)) {
                    map.put(number, map.get(number) + 1);
                }else{
                    map.put(number, 1);
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

            Map<Integer, Integer> map = new HashMap<>();

            for (Integer number : numbers) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            for (Integer number : numbers) {
                if (map.get(number) == 1) {
                    return number;
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
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = i+1; j < numbers.size(); j++) {
                    if(numbers.get(i) + numbers.get(j) == target){
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

            // TODO: Implement this method
            Set<String> wordSet = new HashSet<>(words);

            return wordSet.size();


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

            Queue<Integer> result = new ArrayDeque<>();
            while (!stack.isEmpty()) {
                result.add(stack.pop());
            }

            return result;
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

            int balance = 0;

            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (c == '(') {
                    balance++;
                } else if (c == ')') {
                    balance--;
                }

                if (balance < 0) {
                    return false;
                }
            }

            return balance == 0;
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
            Map<Integer, Integer> map = new HashMap<>();

            for (Integer number : numbers) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            int maxFreq = 0;
            Integer maxKey = null;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            return maxKey;



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

            Map<Integer, List<String>> result = new HashMap<>();

            for (String word : words) {
                int length = word.length();

                if (!result.containsKey(length)) {
                    result.put(length, new ArrayList<>());
                }

                result.get(length).add(word);
            }

            return result;
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

            if (numbers == null || numbers.isEmpty() || k <= 0 || k > numbers.size()) {
                throw new IllegalArgumentException("Invalid input");
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.size()-k+1; i++) {
                   int maxTest = 0;
                   for(int j = i; j < i+k; j++){
                       maxTest = numbers.get(j) + maxTest;
                   }
                   if (maxTest > max) {
                       max = maxTest;
                   }



               }
                return max;
            }

        }
    }
