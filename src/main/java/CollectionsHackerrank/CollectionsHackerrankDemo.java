package CollectionsHackerrank;

import java.util.*;

public class CollectionsHackerrankDemo {
    public static void run() {
        System.out.println("=== Collections HackerRank Practice ===");

        problem1_removeDuplicates();
        problem2_countWordFrequency();
        problem3_reverseList();
        problem4_sortWithTreeSet();
        problem5_anagramCheck();
        problem6_firstNonRepeatingCharacter();
        problem7_queueSimulation();
        problem8_stackExample();
        problem9_studentGradesMap();
        problem10_priorityQueueExample();
    }

    public static void problem1_removeDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> unique = new LinkedHashSet<>(numbers);
        System.out.println("1. Remove duplicates: " + unique);
    }

    public static void problem2_countWordFrequency() {
        String sentence = "apple banana apple orange banana apple";
        String[] words = sentence.split(" ");
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("2. Word frequency: " + frequency);
    }

    public static void problem3_reverseList() {

        List<String> items = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        Collections.reverse(items);

        System.out.println("3. Reversed list: " + items);

    }

    public static void problem4_sortWithTreeSet() {

        Set<Integer> numbers = new TreeSet<>(Arrays.asList(50, 10, 40, 20, 10, 30));

        System.out.println("4. Sorted unique numbers: " + numbers);
    }

    public static void problem5_anagramCheck() {

        String a = "listen";

        String b = "silent";

        char[] arr1 = a.toCharArray();

        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println("5. Are listen and silent anagrams? " + isAnagram);
    }

    public static void problem6_firstNonRepeatingCharacter() {

        String word = "swiss";

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char c : word.toCharArray()) {

            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        Character firstUnique = null;

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {

            if (entry.getValue() == 1) {
                firstUnique = entry.getKey();
                break;
            }
        }

        System.out.println("6. First non-repeating character in 'swiss': " + firstUnique);
    }

    public static void problem7_queueSimulation() {

        Queue<String> customers = new LinkedList<>();

        customers.offer("Customer1");

        customers.offer("Customer2");

        customers.offer("Customer3");

        System.out.println("7. Serving: " + customers.poll());

        System.out.println("   Remaining queue: " + customers);
    }

    public static void problem8_stackExample() {

        Stack<String> stack = new Stack<>();

        stack.push("(");

        stack.push("{");

        stack.pop();

        System.out.println("8. Stack contents: " + stack);
    }

    public static void problem9_studentGradesMap() {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("Kenneth", 95);

        grades.put("Jordan", 88);

        grades.put("Chris", 91);

        System.out.println("9. Student grades: " + grades);
    }

    public static void problem10_priorityQueueExample() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(25);

        pq.offer(5);

        pq.offer(15);

        pq.offer(1);

        System.out.println("10. Smallest item from PriorityQueue: " + pq.poll());
    }
}