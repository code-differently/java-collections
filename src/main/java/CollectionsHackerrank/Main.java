package CollectionsHackerrank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.removeDuplicates(Arrays.asList(1, 2, 2, 3, 4, 4, 5)));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.countFrequency(Arrays.asList(1, 2, 2, 3, 4, 4, 5)));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.firstUnique(Arrays.asList(1, 2, 2, 3, 4, 4, 5)));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.twoSum(Arrays.asList(1, 2, 2, 3, 4, 4, 5), 7));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.countUniqueWords(Arrays.asList("Apple", "Orange", "Orange", "Pear")));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.reverseQueue(queue));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.isBalanced("()"));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.isBalanced("((()"));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.mostFrequent(Arrays.asList(1, 2, 2, 3, 4, 4, 5)));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.groupByLength(Arrays.asList("Apple", "Orange", "Orange", "Pear")));
        System.out.println(CollectionsHackerrankProblems.CollectionsHackerrankPractice.maxSlidingWindowSum(Arrays.asList(1, 2, 2, 3, 4, 4, 5), 2));


    }
}
