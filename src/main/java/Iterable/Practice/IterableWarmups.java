package Iterable.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableWarmups {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(10);
        numbers.add(4);
        numbers.add(8);

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Even count: " + countEven(numbers));
        System.out.println("Max value: " + findMax(numbers));
    }


    /*
    PROBLEM 1
    Return the sum of all numbers in the iterable
     */
    public static int sum(Iterable<Integer> numbers) {

        int total = 0;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            total += iterator.next();
        }

        // TODO:
        // Use a for-each loop to calculate the sum

        return total;
    }


    /*
    PROBLEM 2
    Count how many numbers are even
     */
    public static int countEven(Iterable<Integer> numbers) {

        int count = 0;

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                count++;
            }
        }

        // TODO:
        // Loop through numbers
        // Increment count if number is even

        return count;
    }


    /*
    PROBLEM 3
    Return the maximum value
     */
    public static int findMax(Iterable<Integer> numbers) {

        int max = Integer.MIN_VALUE;
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > max) {
                max = number;
            }
        }

        // TODO:
        // Loop through numbers
        // Update max if current number is larger

        return max;
    }


    /*
    PROBLEM 4 (BONUS)
    Count how many times a word appears
     */
    public static int countMatches(Iterable<String> words, String target) {

        int count = 0;

        if (target == null) {
            return 0;
        }
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (target.equals(word)) {
                count++;
            }

        }
                // TODO:
                // Loop through words
                // Compare each word to target

                return count;
            }
        }
