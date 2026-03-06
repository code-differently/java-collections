package Lists.ArrayLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListProblems {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);

        System.out.println("Sum: " + sum(numbers));
        System.out.println("Even Count: " + countEvens(numbers));
        System.out.println("Contains Duplicate: " + hasDuplicate(numbers));
        System.out.println("Max Value: " + findMax(numbers));
        System.out.println("Reversed List: " + reverse(numbers));
    }

    /*
    Problem 1
    Return the sum of all numbers in the list.
    */
    public static int sum(List<Integer> nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    /*
    Problem 2
    Count how many EVEN numbers exist in the list.
    */
    public static int countEvens(List<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /*
    Problem 3
    Determine if the list contains any duplicate values.
    */
    public static boolean hasDuplicate(List<Integer> nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; // duplicate found
            }
        }
        return false;
    }

    /*
    Problem 4
    Return the largest number in the list.
    */
    public static int findMax(List<Integer> nums) {
        if (nums.isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        int max = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /*
    Problem 5
    Return a NEW list that contains the elements of the original list in reverse order.
    */
    public static List<Integer> reverse(List<Integer> nums) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            reversed.add(nums.get(i));
        }
        return reversed;
    }
}