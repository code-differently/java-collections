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

        // TODO:
        // Use iterator.hasNext() and iterator.next()
        // Print each number
        while(iterator.hasNext()){
            int x = iterator.next();
            System.out.println(x);

        }




        System.out.println("\nRemoving odd numbers using Iterator");

        iterator = numbers.iterator();

        // TODO:
        // Use iterator to remove odd numbers
        // Remember: use iterator.remove()
        while(iterator.hasNext()){
            int x = iterator.next();
            if (x%2==0){
                iterator.remove();
            }
        }

        System.out.println("\nUpdated list:");
        System.out.println(numbers);
    }
}
