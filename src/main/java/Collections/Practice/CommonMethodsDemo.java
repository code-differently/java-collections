package Collections.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommonMethodsDemo {
    public static void main(String[] args) {

        System.out.println("=== COLLECTION COMMON METHODS DEMO ===\n");

        /*
         IMPORTANT CONCEPT:
         We are using the Collection interface as the reference type.
         The object type is ArrayList.
        */

        Collection<String> fruits = new ArrayList<>();

        // ------------------------------
        // add()
        // ------------------------------

        System.out.println("Adding elements using add()");

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);


        // ------------------------------
        // size()
        // ------------------------------

        System.out.println("\nChecking size of collection");

        int size = fruits.size();
        System.out.println("Size: " + size);


        // ------------------------------
        // contains()
        // ------------------------------

        System.out.println("\nChecking if collection contains certain items");

        boolean hasApple = fruits.contains("Apple");
        boolean hasGrape = fruits.contains("Grape");

        System.out.println("Contains Apple? " + hasApple);
        System.out.println("Contains Grape? " + hasGrape);


        // ------------------------------
        // remove()
        // ------------------------------

        System.out.println("\nRemoving an element");

        fruits.remove("Banana");

        System.out.println("After removing Banana:");
        System.out.println(fruits);


        // ------------------------------
        // addAll()
        // ------------------------------

        System.out.println("\nAdding multiple elements using addAll()");

        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Strawberry");
        moreFruits.add("Peach");

        fruits.addAll(moreFruits);

        System.out.println("After addAll:");
        System.out.println(fruits);


        // ------------------------------
        // Iterating through Collection
        // ------------------------------

        System.out.println("\nLooping through collection:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // ------------------------------
        // isEmpty()
        // ------------------------------

        System.out.println("\nChecking if collection is empty");

        boolean empty = fruits.isEmpty();
        System.out.println("Is empty? " + empty);


        // ------------------------------
        // clear()
        // ------------------------------

        System.out.println("\nClearing the collection");

        fruits.clear();

        System.out.println("After clear:");
        System.out.println(fruits);


        System.out.println("\nCheck if empty after clear:");

        System.out.println("Is empty? " + fruits.isEmpty());


        // ------------------------------
        // TODO Exploration Section
        // ------------------------------

        /*
         TODO 1:
         Create a new Collection called numbers
         Add the following values:
         10, 20, 30, 40, 50
        */
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);


        /*
         TODO 2:
         Print the size of the numbers collection
        */

        System.out.println("Size collection: "+ numbers.size());

        /*
         TODO 3:
         Check if the collection contains 30
        */
        for (Integer number: numbers){
            if(numbers.contains(30)){
                System.out.println(true);
                break;
            }
        }

        /*
         TODO 4:
         Remove the number 20
        */
        numbers.remove(20);
        System.out.println(numbers);


        /*
         TODO 5:
         Loop through the numbers collection
         and print each value
        */
        for(Integer number: numbers){
            System.out.println(number);
        }


        /*
         REFLECTION QUESTIONS:

         1. Why can we use Collection as the reference type?

         - Interface Parent class of data structures such as lists, sets,
         and queues.

         2. What methods are available because of the Collection interface?

         - add(), remove(), size(), isEmpty();, contains(), iterator(), clear()

         3. What methods are NOT available when using Collection instead of List?

         - get(int index), set(int index, element), add(int index, element),
         remove(int index)

         */

    }

}
