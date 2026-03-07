package Iterable.Practice;

import java.util.ArrayList;
import java.util.List;

public class IterableWarmups {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(10);
        numbers.add(4);
        numbers.add(8);

        List<String> words = new ArrayList<>();
        words.add("fun");
        words.add("funny");
        words.add("funny money");

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Even count: " + countEven(numbers));
        System.out.println("Max value: " + findMax(numbers));
        System.out.println("Count Matches: " + countMatches(words,"fun"));


    }


    /*
    PROBLEM 1
    Return the sum of all numbers in the iterable
     */
    public static int sum(Iterable<Integer> numbers) {

        int total = 0;
        for (int x: numbers){
            total+=x;
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

        for (int c: numbers){
            if (c%2==0){
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
for (int x: numbers){
    if (x>max){
        max=x;
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
        for (String x: words){
            if (x.equals(target)){
                count++;
            }
        }
        // TODO:
        // Loop through words
        // Compare each word to target
        return count;
    }
}
