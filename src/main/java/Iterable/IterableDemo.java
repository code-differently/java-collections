package Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
    public static void run() {
        System.out.println("=== Iterable Demo ===");

        List<String> names = new ArrayList<>();

        names.add("Kenneth");

        names.add("Kenny");

        names.add("Ken");

        System.out.println("Enhanced for-loop:");

        for (String name : names) {
            System.out.println(name);

        }

        System.out.println();

        System.out.println("Iterator:");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        System.out.println();
    }
}