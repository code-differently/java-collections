package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListsDemo {
    public static void run() {
        System.out.println("=== Lists Demo ===");

        List<String> arrayList = new ArrayList<>();

        arrayList.add("A");

        arrayList.add("B");

        arrayList.add("C");

        System.out.println("ArrayList: " + arrayList);

        System.out.println("ArrayList get(1): " + arrayList.get(1));

        List<String> linkedList = new LinkedList<>();

        linkedList.add("X");

        linkedList.add("Y");

        linkedList.add("Z");

        System.out.println("LinkedList: " + linkedList);

        Vector<Integer> vector = new Vector<>();

        vector.add(10);

        vector.add(20);

        vector.add(30);
        System.out.println("Vector: " + vector);

        Stack<String> stack = new Stack<>();

        stack.push("Bottom");

        stack.push("Middle");

        stack.push("Top");

        System.out.println("Stack before pop: " + stack);

        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        System.out.println();
    }
}