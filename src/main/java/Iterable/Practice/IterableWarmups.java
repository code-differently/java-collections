package Iterable.Practice;

import java.util.ArrayList;
import java.util.List;

public class IterableWarmups {
    /*
 PROBLEM 1
 Return the sum of all numbers in the iterable
 */
    public static int sum(Iterable<Integer> numbers) {

        int total = 0;

        // Loop through each number in the iterable
        for (int num : numbers) {
            total += num; // add each number to total
        }

        return total;
    }


    /*
    PROBLEM 2
    Count how many numbers are even
    */
    public static int countEven(Iterable<Integer> numbers) {

        int count = 0;

        // Loop through each number
        for (int num : numbers) {

            // Check if the number is even
            if (num % 2 == 0) {
                count++; // increase counter
            }
        }

        return count;
    }


    /*
    PROBLEM 3
    Return the maximum value
    */
    public static int findMax(Iterable<Integer> numbers) {

        int max = Integer.MIN_VALUE;

        // Loop through numbers
        for (int num : numbers) {

            // If current number is greater than max
            if (num > max) {
                max = num; // update max
            }
        }

        return max;
    }


    /*
    PROBLEM 4 (BONUS)
    Count how many times a word appears
    */
    public static int countMatches(Iterable<String> words, String target) {

        int count = 0;

        // Loop through each word
        for (String word : words) {

            // Compare word to target
            if (word.equals(target)) {
                count++;
            }
        }

        return count;
    }
}