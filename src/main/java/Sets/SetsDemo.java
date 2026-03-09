package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void run() {

        System.out.println("=== Sets Demo ===");

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Dog");

        hashSet.add("Cat");

        hashSet.add("Dog");

        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Red");

        linkedHashSet.add("Blue");

        linkedHashSet.add("Green");

        linkedHashSet.add("Blue");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);

        treeSet.add(10);

        treeSet.add(30);

        treeSet.add(10);

        System.out.println("TreeSet: " + treeSet);

        System.out.println();
    }
}