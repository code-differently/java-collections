package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankProblems {
    public class CollectionsHackerrankPractice {

        public static void main(String[] args) {

            // You can test your methods here

            List<Integer> numbers = new ArrayList<>();

            numbers.add(4);
            numbers.add(8);
            numbers.add(15);
            numbers.add(16);
            numbers.add(23);
            numbers.add(42);
            numbers.add(4);

            System.out.println("Remove Duplicates: " + removeDuplicates(numbers));
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
            return (List<Integer>) new HashSet<>(numbers);
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
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < numbers.size(); i++) {
                int num = numbers.get(i);

                if(map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                }
                else {
                    map.put(num, 1);
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
            LinkedHashMap<Integer, Integer> numberMap = new LinkedHashMap<>();

            //populate hashmap
            for(int num : numbers) {
                if(numberMap.containsKey(num)) {
                    numberMap.put(num, numberMap.get(num) + 1);
                }
                else {
                    numberMap.put(num, 1);
                }
            }


            //find first unique num in LinkedHashMap (ordered by insertion)
            for(int num : numberMap.keySet()) {
                //1 means only appeared once, value is set to the # frequency in my hashMap
                if(numberMap.get(num) <= 1) {
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
            //Bad way, check list of numbers for every number we iterate through O(n^2)
            /*
            for(int i = 0; i < numbers.size(); i++) {
                for(int j = 0; j < numbers.size(); j++) {
                    if(numbers.get(i) + numbers.get(j) == target)
                    {
                        return true;
                    }
                }
            }
            */


            //Good (decent) way,
            //build dict of known values, dont need to worry about value,
            //want O(1) access of key!

            HashMap<Integer,Integer> numMap = new HashMap<>();

            for(int num : numbers) {
                numMap.put(num, 1);
            }

            //iterate through array,
            // originally we did arr[i] + arr[j] = target
            //but I want to solve for arr[j] now.

            //so its now gonna be abs(arr[i] - target) = arr[j]
            for (int i = 0; i < numbers.size(); i++) {

                int sumNeededValue = Math.abs(numbers.get(i) - target);
                //if this value that we need for the target is
                // somewhere in our list, return true.
                if(numMap.containsKey(sumNeededValue)) {
                    return true;
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

            int count = 0;
            //make hashMap
            //iterate through list
            //if not in hashmap, add to counter

            HashMap<String, Integer> wordMap = new HashMap<>();

            //Iterate through words, add to Map
            for(String word : words) {
                if (wordMap.containsKey(word)) {
                    wordMap.put(word, wordMap.get(word) + 1);
                }
                else {
                    wordMap.put(word, 1);
                }
            }

            //then if its 1, increment counter;
            for(int i = 0; i < words.size(); i++) {
                String word = words.get(i);

                if(wordMap.get(word) <= 1 ) {
                    count++;
                }
            }

            return count;
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

            //convert queue to array
            ArrayList<Integer> newList = new ArrayList<>();

            //populate array with queue values
            for(int i = 0; i < queue.size(); i++) {
                newList.add(queue.poll());
            }

            //reverse list
            newList.reversed();

            //then back to Queue (LinkedList, cause Queue is an interface)
            Queue<Integer> resultQueue = new LinkedList<>(newList);

            return resultQueue;
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

            int lCount = 0;
            int rCount = 0;

            //Count left parenthesis and right parenthesis, if they have equal count
            //then they are balanced.
            for(int i = 0; i < expression.length(); i++) {
                if(expression.charAt(i) == '(') {
                    lCount++;
                }
                else if (expression.charAt(i) == ')') {
                    rCount++;
                }
            }
            return lCount == rCount;
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


            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            //Build HashMap, based on number frequency
            for(int num : numbers) {
                if(frequencyMap.containsKey(num)) {
                    frequencyMap.put(num, frequencyMap.get(num) + 1);
                }
                else {
                    frequencyMap.put(num, 1);
                }
            }

            int maxValue = 0;
            int mostFrequentNum = 0;

            //Iterate through HashMap keys, find which one has the largest value
            //return that value.

            for(int key : frequencyMap.keySet()) {
                //Max pattern
                if(frequencyMap.get(key) > maxValue) {
                    maxValue = frequencyMap.get(key);
                    mostFrequentNum = key;
                }
            }

            return mostFrequentNum;
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

            HashMap<Integer, List<String>> lenGroup = new HashMap<>();

            //build map.
            for(String word: words) {

                //Key is now the length
                if(lenGroup.containsKey(word.length())) {
                    List<String> getList = lenGroup.get(word.length());
                    getList.add(word);
                    lenGroup.put(word.length(), getList);
                }
                else {
                    List<String> wordList = new ArrayList<>();
                    wordList.add(word);
                    lenGroup.put(word.length(),wordList);
                }

            }
            return lenGroup;
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

            //initialize variables
            int l = 0;
            int r = 0;

            int maxSum = 0;
            int sum = 0;
            boolean rWindowReached = false;

            //minus the slided value, keep sum otherwise.
            //like a train.

            //while loop
            while(r < numbers.size()) {

                if(!rWindowReached) {
                    //ad r value to sum, until r reaches k-1
                    sum += r;
                    r++;

                    //check if r reaches k-1
                    if(r >= k-1) {
                        rWindowReached = true;

                        //If new maxSum found, set it
                        if(sum >= maxSum) {
                            maxSum = sum;
                        }
                    }
                }
                else {

                    //subtract left side of window
                    sum -= numbers.get(l);
                    l++;

                    //add right side of window
                    sum += numbers.get(r);
                    r++;

                    //If new maxSum found, set it
                    if(sum >= maxSum) {
                        maxSum = sum;
                    }

                }

            }

            return maxSum;
        }
    }
}
