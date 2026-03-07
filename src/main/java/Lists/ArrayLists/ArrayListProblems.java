package Lists.ArrayLists;


import java.util.ArrayList;
import java.util.List;

public class ArrayListProblems {



    public class ListPractice {

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


        // Problem 1
        public static int sum(List<Integer> nums) {

            int total = 0;

            for (int num : nums) {
                total += num;
            }

            return total;
        }


        // Problem 2
        public static int countEvens(List<Integer> nums) {

            int count = 0;

            for (int num : nums) {

                if (num % 2 == 0) {
                    count++;
                }
            }

            return count;
        }


        // Problem 3
        public static boolean hasDuplicate(List<Integer> nums) {

            for (int i = 0; i < nums.size(); i++) {

                for (int j = i + 1; j < nums.size(); j++) {

                    if (nums.get(i).equals(nums.get(j))) {
                        return true;
                    }
                }
            }

            return false;
        }


        // Problem 4
        public static int findMax(List<Integer> nums) {

            int max = nums.get(0);

            for (int num : nums) {

                if (num > max) {
                    max = num;
                }
            }

            return max;
        }


        // Problem 5
        public static List<Integer> reverse(List<Integer> nums) {

            List<Integer> reversed = new ArrayList<>();

            for (int i = nums.size() - 1; i >= 0; i--) {
                reversed.add(nums.get(i));
            }

            return reversed;
        }
    }
}