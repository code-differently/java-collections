package CollectionsHackerrank;

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
// Use LinkedHashSet to remove duplicates and keep order
            Set<Integer> unique = new LinkedHashSet<>(numbers);

            // Convert back to List
            return new ArrayList<>(unique);
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
//Create a HashMap to store counts.
//Loop through the list.
//getOrDefault(num, 0):
//If the number is not in the map → return 0
//If it exists → return the current count
//Add 1 to update the count.
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (Integer num : numbers) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
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
            //Use LinkedHashMap to store counts while keeping order.
            //First loop → count occurrences.
            //Second loop → return the first key whose value is 1.
            Map<Integer, Integer> map = new LinkedHashMap<>();
          //List<Integer> input = Arrays.asList(4,5,1,2,0,4);
            //System.out.println(firstUnique(input));
            // Count frequency
            for (Integer num : numbers) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // Find first number with count = 1
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return null; // if no unique number exists
        }
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
            //Check if the complement already appeared in the list.
            //If yes → the two numbers add up to the target → return true.
            //Otherwise add the current number to the set and continue.
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

            // TODO: Implement this method
// Queue → Stack
//poll() removes elements from the queue.
//push() adds them to the stack.
//Stack → Queue
//pop() removes from stack (last-in-first-out).
//offer() adds back to queue.
//This reverses the order.
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

            // TODO: Implement this method
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

            // TODO: Implement this method
//use a Map to count occurrences, then track the number with the highest count.
            Map<Integer, Integer> map = new HashMap<>();

            // Count frequencies
            for (Integer num : numbers) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            Integer mostFrequent = null;
            int maxCount = 0;

            // Find the number with highest frequency
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequent = entry.getKey();
                }
            }

            return mostFrequent;
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
//using the Sliding Window technique so we don’t repeatedly sum the same elements.
            // TODO: Implement this method

            int windowSum = 0;
            int maxSum = 0;

            // First window
            for (int i = 0; i < k; i++) {
                windowSum += numbers.get(i);
            }

            maxSum = windowSum;

            // Slide the window
            for (int i = k; i < numbers.size(); i++) {
                windowSum += numbers.get(i);       // add next element
                windowSum -= numbers.get(i - k);   // remove element leaving window

                maxSum = Math.max(maxSum, windowSum);
            }

            return maxSum;
        }
    }
}
