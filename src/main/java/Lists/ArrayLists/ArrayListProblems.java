package Lists.ArrayLists;


import java.util.ArrayList;
import java.util.List;

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

    Example
    Input: [1,2,4,7]
    Output: 2
    */
    public static int countEvens(List<Integer> nums) {

        // TODO: Implement this method
        int count =0;
for(int n:nums){
    if(n%2==0){
count ++;
    }
}
        return count;
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

                Set<Integer> seen = new HashSet<>();

                for (int n : nums) {
                    if (seen.contains(n)) {
                        return true;
                    }
                    seen.add(n);
                }

                return false;
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

            List<Integer> reversed = new ArrayList<>();

            for (int i = nums.size() - 1; i >= 0; i--) {
                reversed.add(nums.get(i));
            }

            return reversed;
        }
