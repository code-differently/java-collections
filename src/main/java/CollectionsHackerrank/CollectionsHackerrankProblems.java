package CollectionsHackerrank;

import java.util.*;


public class CollectionsHackerrankProblems {


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
            Set<Integer> set = new LinkedHashSet<>(numbers);//Have to convert List to Set
            //Set removes duplicates *LinkedHashSet Keeps the value in order
            return new ArrayList<>(set);//Covert the Set back to List
            // because the method calls for a List *Set is just for removing Duplicates
            // TODO: Implement this method


        }

        /*
        Problem 2
        Count how many times each number appears.

        Example
        Input: [1,2,2,3,3,3]
        Output: {1=1, 2=2, 3=3}
        */
        public static Map<Integer, Integer> countFrequency(List<Integer> numbers) {
            //takes a list of numbers
            //returns a map of counts
            Map<Integer, Integer> map = new HashMap<>();//This creates an empty HashMap called map
            for (int num : numbers) { //for each loop to run through the list
                map.put(num, map.getOrDefault(num, 0) + 1);
                //This line basically updates the counter for the number
                //it Gets the value for this key
                // and If the key does not exist, return 0
            }

            return map;//returns the final results
            // TODO: Implement this method


        }

        /*
        Problem 3
        Return the first number that appears only once.

        Example
        Input: [4,5,1,2,0,4]
        Output: 5
        */
        public static Integer firstUnique(List<Integer> numbers) {
            //THe method header
            Map<Integer, Integer> map = countFrequency(numbers);//calling

            for (int num : numbers) {
                if (map.get(num) == 1) {
                    //get the count for this number
                    return num;
                    //returning the number that appears once
                }
            }

            return null;
            // TODO: Implement this method


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
            //This set stores numbers we have already seen.

            for (int num : numbers) {
                if (seen.contains(target - num)) {
                    //if we already saw the number that would complete the target.
                    return true;
                }
                seen.add(num);//adds the number into the seen object that was created
            }

            return false;
            // TODO: Implement this method


        }

        /*
        Problem 5
        Count how many unique words exist in a list.

        Example
        Input: ["apple","banana","apple","orange"]
        Output: 3
        */
        public static int countUniqueWords(List<String> words) {
            Set<String> set = new HashSet<>(words);
            return set.size();
            // TODO: Implement this method


        }

        /*
        Problem 6
        Reverse a queue.

        Example
        Input: [1,2,3,4]
        Output: [4,3,2,1]
        */
        public static Queue<Integer> reverseQueue(Queue<Integer> queue) {

            // Create a stack to help reverse the order
            // Stacks are LIFO (Last In First Out)
            Stack<Integer> stack = new Stack<>();

            // Move all elements from the queue into the stack
            // Queue removes from the front using poll()
            while (!queue.isEmpty()) {
                stack.push(queue.poll()); // remove from queue and push into stack
            }

            // Now move everything back from the stack into the queue
            // Since stacks remove the last element added, the order becomes reversed
            while (!stack.isEmpty()) {
                queue.offer(stack.pop()); // pop from stack and add back to queue
            }

            // Return the reversed queue
            return queue;
            // TODO: Implement this method


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

            // Create a stack to keep track of opening parentheses
            Stack<Character> stack = new Stack<>();

            // Loop through each character in the string
            for (char c : expression.toCharArray()) {

                // If we see an opening parenthesis, push it onto the stack
                if (c == '(') {
                    stack.push(c);
                }

                // If we see a closing parenthesis
                else if (c == ')') {

                    // If the stack is empty, there was no matching '('
                    // Example: ")("
                    if (stack.isEmpty()) {
                        return false;
                    }

                    // Otherwise remove the matching '(' from the stack
                    stack.pop();
                }
            }

            // If the stack is empty, all parentheses matched correctly
            // If not empty, there are extra '(' left
            return stack.isEmpty();
            // TODO: Implement this method


        }

        /*
        Problem 8
        Return the number that appears most frequently in the list.

        Example
        Input: [1,3,2,3,4,3]
        Output: 3
        */
        public static Integer mostFrequent(List<Integer> numbers) {

            // Count how many times each number appears

            Map<Integer, Integer> map = countFrequency(numbers);

            // Track the highest frequency seen so far
            int max = 0;

            //  Track which number has that highest frequency
            Integer result = null;

            // Loop through each number in the map
            for (int key : map.keySet()) {

                // If this number occurs more times than the current max
                if (map.get(key) > max) {

                    // Update max frequency
                    max = map.get(key);

                    // Update the number that has the highest frequency
                    result = key;
                }
            }

            // Return the number that appears most frequently
            return result;
            // TODO: Implement this method


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

            // Create a map where:
            // key = length of a word
            // value = list of words with that length
            Map<Integer, List<String>> map = new HashMap<>();

            // Loop through each word in the input list
            for (String word : words) {

                // Find the length of the current word
                int length = word.length();

                //  If this length is not already a key in the map
                // create a new list for this length
                if (!map.containsKey(length)) {
                    map.put(length, new ArrayList<>());
                }

                //  Add the word to the list for its length
                map.get(length).add(word);
            }

            //  Return the map grouping words by their length
            return map;
            // TODO: Implement this method


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

            // Initialize a variable to keep track of the maximum sum
            int maxSum = 0;

            // Loops over each possible starting index of a window of size k
            for (int i = 0; i <= numbers.size() - k; i++) {

                // Initialize sum for the current window
                int currentSum = 0;

                //Sum up all numbers in the current window
                for (int j = i; j < i + k; j++) {
                    currentSum += numbers.get(j);
                }

                // Update maxSum if the current window sum is bigger
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            // Returns the largest sum found among all windows
            return maxSum;
            // TODO: Implement this method


        }
    }

