package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {
    public static class CollectionsHackerrankPractice {
        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(3);
            list.add(3);
            list.add(3);
            list.add(33);
            list.add(33);
            list.add(33);

            System.out.println(list);
            System.out.println(removeDuplicates(list));
            System.out.println(countFrequency(list));
            System.out.println(firstUnique(list));
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
            return new ArrayList<>(new HashSet<>(numbers));
        }

        /*
        Problem 2
        Count how many times each number appears.

        Example
        Input: [1,2,2,3,3,3]
        Output: {1=1, 2=2, 3=3}
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {
            Map<Integer, Integer> map = new HashMap<>();

            for( int i : numbers){
                map.put(i,map.getOrDefault(i,0)+1);
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
            Map<Integer,Integer> map = new LinkedHashMap<>();
            for(int i: numbers){
             map.put(i,map.getOrDefault(numbers,0));
            }
            for (Map.Entry<Integer,Integer>entry: map.entrySet())
                if(entry.getValue()==1){
                    return entry.getKey();
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
            Set<String> uniqueWords = new HashSet<>(words);

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

            Stack<Integer> stack = new Stack<>();

            // Move elements from queue to stack
            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            // Move elements back to queue (reversed order)
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
//use a Stack.
//A stack works well because we must match every opening ( with a closing ) in the correct order.
            Stack<Character> stack = new Stack<>();

            for (char ch : expression.toCharArray()) {

                if (ch == '(') {
                    stack.push(ch); // store opening parenthesis
                }

                else if (ch == ')') {
                    if (stack.isEmpty()) {
                        return false; // no matching opening
                    }
                    stack.pop(); // match found
                }
            }

            // if stack is empty, parentheses are balanced
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
            int max = numbers.getFirst();
            int maxKey  = numbers.getFirst();
            Map<Integer, Integer> map = new HashMap<>();

            for (Integer number : numbers) {
                if (map.containsKey(number)) {
                    map.put(number, map.get(number) + 1);
                }else{
                    map.put(number, 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
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
            if (numbers.size() < k){
                return numbers.getFirst();
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