package Lists.ArrayLists;


import java.util.ArrayList;
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

    Example
    Input: [1,2,3]
    Output: 6
    */
    public static int sum(List<Integer> nums) {
        // TODO: Implement this method
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    /*
    Problem 2
    Count how many EVEN numbers exist in the list.

    Example
    Input: [1,2,4,7]
    Output: 2
    */
    public static int countEvens(List<Integer> nums) {

        // TODO: Implement this method
        int evens = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evens++;
            }
        }

        return evens;
    }

    /*
    Problem 3
    Determine if the list contains any duplicate values.

    Example
    Input: [1,2,3,1]
    Output: true

    Input: [1,2,3]
    Output: false
    */
    public static boolean hasDuplicate(List<Integer> nums) {

        // TODO: Implement this method
        if (nums.size() != Set.copyOf(nums).size()) {
            return true;
        }
        return false;
    }

    /*
    Problem 4
    Return the largest number in the list.

    Example
    Input: [4,2,7]
    Output: 7
    */
    public static int findMax(List<Integer> nums) {

        // TODO: Implement this method
        int max = Integer.MIN_VALUE;
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

    Example
    Input: [1,2,3]
    Output: [3,2,1]

    The original list should remain unchanged.
    */
    public static List<Integer> reverse(List<Integer> nums) {

        // TODO: Implement this method
        return nums.reversed();
    }
}
