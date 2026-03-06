package Collections.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionBasics {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(16);
        numbers.add(23);
        numbers.add(42);

        System.out.println("Sum of numbers: " + sum(numbers));
        System.out.println("Count of even numbers: " + countEven(numbers));
        System.out.println("Largest number: " + findMax(numbers));
        System.out.println("Contains duplicates? " + hasDuplicates(numbers));
        System.out.println("Count occurrences of 20 " + countOccurrences(numbers,20));
        System.out.println("Numbers greater than 20: " + filterGreaterThanTwenty(numbers));
    }


    /*
     PROBLEM 1
     Return the sum of all numbers in the collection
    */
    public static int sum(Collection<Integer> numbers) {

        int total = 0;

        // TODO:
        for(int num : numbers){
            total+= num;
        }

        return total;
    }


    /*
     PROBLEM 2
     Count how many numbers are even
    */
    public static int countEven(Collection<Integer> numbers) {

        int count = 0;

        // TODO:
        for(int num : numbers){
           if (num % 2 ==0){
               count++;
           }
        }

        return count;
    }


    /*
     PROBLEM 3
     Find the largest number in the collection
    */
    public static int findMax(Collection<Integer> numbers) {

        int max = Integer.MIN_VALUE;

        // TODO:
        for (int num : numbers){
            if(num > max) {
                max = num;
            }
        }

        return max;
    }


    /*
     PROBLEM 4
     Return true if the collection contains duplicates
     Return false otherwise
    */
    public static boolean hasDuplicates(Collection<Integer> numbers) {

        // TODO:
        HashSet<Integer> set = new HashSet<>(numbers);

        return set.size() != numbers.size();
    }


    /*
     PROBLEM 5
     Count how many times a target value appears
    */
    public static int countOccurrences(Collection<Integer> numbers, int target) {

        int count = 0;

        // TODO:
        for (int num : numbers){

            if (num == target ){
                count++;
            }
        }

        return count;
    }


    /*
     BONUS PROBLEM
     Create and return a new collection
     that only contains numbers greater than 20
    */
    public static Collection<Integer> filterGreaterThanTwenty(Collection<Integer> numbers) {

        Collection<Integer> result = new ArrayList<>();

        // TODO:
        for (int num : numbers){
            if (num >20){
                result.add(num);
            }
        }

        return result;
    }
}
