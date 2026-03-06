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
        */
        public static List<Integer> removeDuplicates(List<Integer> numbers) {

            Set<Integer> set = new LinkedHashSet<>(numbers);
            return new ArrayList<>(set);
        }

        /*
        Problem 2
        Count how many times each number appears.
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {

            Map<Integer, Integer> map = new HashMap<>();

            for(Integer num : numbers){

                map.put(num, map.getOrDefault(num, 0) + 1);

            }

            return map;
        }

        /*
        Problem 3
        Return the first number that appears only once.
        */
        public static Integer firstUnique(List<Integer> numbers) {

            Map<Integer, Integer> map = new HashMap<>();

            for(Integer num : numbers){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for(Integer num : numbers){
                if(map.get(num) == 1){
                    return num;
                }
            }

            return null;
        }

        /*
        Problem 4
        Return true if any two numbers add up to the target.
        */
        public static boolean twoSum(List<Integer> numbers, int target) {

            Set<Integer> set = new HashSet<>();

            for(Integer num : numbers){

                int complement = target - num;

                if(set.contains(complement)){
                    return true;
                }

                set.add(num);

            }

            return false;
        }

        /*
        Problem 5
        Count how many unique words exist in a list.
        */
        public static int countUniqueWords(List<String> words) {

            Set<String> set = new HashSet<>(words);

            return set.size();
        }

        /*
        Problem 6
        Reverse a queue.
        */
        public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

            Stack<Integer> stack = new Stack<>();

            while(!queue.isEmpty()){
                stack.push(queue.poll());
            }

            while(!stack.isEmpty()){
                queue.add(stack.pop());
            }

            return queue;
        }

        /*
        Problem 7
        Determine whether parentheses are balanced.
        */
        public static boolean isBalanced(String expression) {

            Stack<Character> stack = new Stack<>();

            for(char c : expression.toCharArray()){

                if(c == '('){
                    stack.push(c);
                }
                else if(c == ')'){

                    if(stack.isEmpty()){
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
        */
        public static Integer mostFrequent(List<Integer> numbers) {

            Map<Integer, Integer> map = new HashMap<>();

            for(Integer num : numbers){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int maxCount = 0;
            Integer result = null;

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){

                if(entry.getValue() > maxCount){

                    maxCount = entry.getValue();
                    result = entry.getKey();

                }

            }

            return result;
        }

        /*
        Problem 9
        Group words based on their length.
        */
        public static Map<Integer, List<String>> groupByLength(List<String> words) {

            Map<Integer, List<String>> map = new HashMap<>();

            for(String word : words){

                int length = word.length();

                map.putIfAbsent(length, new ArrayList<>());

                map.get(length).add(word);

            }

            return map;
        }

        /*
        Problem 10
        Return the maximum sum of any window of size k.
        */
        public static int maxSlidingWindowSum(List<Integer> numbers, int k) {

            int maxSum = 0;
            int windowSum = 0;

            for(int i = 0; i < numbers.size(); i++){

                windowSum += numbers.get(i);

                if(i >= k - 1){

                    maxSum = Math.max(maxSum, windowSum);

                    windowSum -= numbers.get(i - (k - 1));

                }

            }

            return maxSum;
        }
    }
}