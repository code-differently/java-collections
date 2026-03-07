package Collections.Practice;

import java.util.*;

public class CollectionBasics {
    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(8);
       //numbers.add(8);
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

        // TODO:
        // Loop through the collection
        // Add each number to total
for(Integer sum: numbers){
    total += sum;
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
        // Loop through the collection
        // If the number is even, increase count
for(Integer even: numbers){
    if(even % 2 == 0){
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
        // Loop through numbers
        // Update max if current number is larger
for(Integer newMax: numbers){
if(newMax > max){
    max = newMax;
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
        // Hint:
        // Compare the size of a collection with the size of a Set
Set<Integer> diffNumbers = new HashSet<>(numbers);

        return diffNumbers.size() !=numbers.size();
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
for(Integer nextNum: numbers){
    if(nextNum == target){
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
        // Loop through numbers
        // Add numbers greater than 20 to result
for(Integer overTwenty: numbers){
    if(overTwenty > 20){
        result.add(overTwenty);
    }
}
        return result;

    }
}
