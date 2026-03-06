package Collections.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionBasics {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();
        filterGreaterThanTwenty(numbers);
        numbers.add(4);
        numbers.add(4);
        numbers.add(15);
        numbers.add(16);
        numbers.add(23);
        numbers.add(42);

        System.out.println("Sum of numbers: " + sum(numbers));
        System.out.println("Count of even numbers: " + countEven(numbers));
        System.out.println("Largest number: " + findMax(numbers));
        System.out.println("Contains duplicates? " + hasDuplicates(numbers));
    }


    /*
     PROBLEM 1
     Return the sum of all numbers in the collection
    */
    public static int sum(Collection<Integer> numbers) {

        int total = 0;
        for (int i: numbers){
            total+=i;
        }


        // TODO:
        // Loop through the collection
        // Add each number to total

        return total;
    }


    /*
     PROBLEM 2
     Count how many numbers are even
    */
    public static int countEven(Collection<Integer> numbers) {

        int count = 0;
        for (int i = 0; i<=numbers.size(); ++i){
            if (i %2==0){
                count++;
                System.out.println(count);
            }
        }

        // TODO:
        // Loop through the collection
        // If the number is even, increase count

        return count;
    }


    /*
     PROBLEM 3
     Find the largest number in the collection
    */
    public static int findMax(Collection<Integer> numbers) {

        int max = Integer.MIN_VALUE;
        for (int num: numbers){
            if (max < num){
                max= num;
            }else {
                max = Integer.MIN_VALUE;
            }
        }

        // TODO:
        // Loop through numbers
        // Update max if current number is larger

        return max;
    }


    /*
     PROBLEM 4
     Return true if the collection contains duplicates
     Return false otherwise
    */
    public static boolean hasDuplicates(Collection<Integer> numbers) {

        // TODO:
        // Hint:
        // Compare the size of a collection with the size of a Set
        Set<Integer> numbersset= new HashSet<>();
        numbersset.add(4);
        numbersset.add(4);
        numbersset.add(15);
        numbersset.add(16);
        numbersset.add(23);
        numbersset.add(42);

        for (int i = 0; i< numbers.size();++i){
            for (int e = 0; e < numbersset.size(); ++i ){
             if (i==e){
                 return true;
             }
            }

        }

        return false;
    }


    /*
     PROBLEM 5
     Count how many times a target value appears
    */
    public static int countOccurrences(Collection<Integer> numbers, int target) {

        int count = 0;

        // TODO:
        // Loop through numbers
        // If number equals target, increase count
        for (int i=0; i==target; ++i){
            ++count;
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
        for (int num:numbers){
            if (num>20){
                result.add(num);
            }
        }
        // TODO:
        // Loop through numbers
        // Add numbers greater than 20 to result
        System.out.println(result);
        return result;

    }
}
