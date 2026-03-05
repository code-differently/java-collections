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
        //hasNext() → Is there another item?
        //next()    → Move to it and give it to me
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            System.out.println(num);
        }
        // Use iterator.hasNext() and iterator.next()
        // Print each number


        System.out.println("\nRemoving odd numbers using Iterator");

        iterator = numbers.iterator();

        // TODO:
        while (iterator.hasNext()) {
            Integer num = iterator.next();//Stored the next int in list in "num"
            if (num % 2 !=0){ //If numbers divided by 2 not equal to 0
                iterator.remove();//Then remove it
            }
        }
        // Use iterator to remove odd numbers
        // Remember: use iterator.remove()


        System.out.println("\nUpdated list:");
        System.out.println(numbers);
    }
}
