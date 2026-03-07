package Iterable.Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Original list:");
        System.out.println(numbers);

// Create iterator
        Iterator<Integer> iterator = numbers.iterator();

        System.out.println("\nIterating using Iterator:");

// Loop through list using iterator
        while (iterator.hasNext()) {

            int number = iterator.next(); // get next number
            System.out.println(number);   // print it
        }

        System.out.println("\nRemoving odd numbers using Iterator");

        iterator = numbers.iterator();

// Remove odd numbers
        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number % 2 != 0) { // check if number is odd
                iterator.remove(); // remove it safely
            }
        }

        System.out.println("\nUpdated list:");
        System.out.println(numbers);
    }
}