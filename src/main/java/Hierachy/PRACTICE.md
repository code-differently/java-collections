````markdown
# Practice Exercises: Java Collections Hierarchy

These exercises help reinforce understanding of the **Java Collections Framework hierarchy** and the relationships between its core interfaces and implementations.

---

# Multiple Choice

## Question 1

Which interface allows an object to be used in an enhanced for-loop?

A. Collection  
B. Iterable  
C. List  
D. Queue

AW: B

---

## Question 2

Which interface is the parent of `List`, `Set`, and `Queue`?

A. Iterable  
B. Collection  
C. Map  
D. Deque

AW: B

---

## Question 3

Which of the following is **NOT part of the Collection hierarchy**?

A. List  
B. Set  
C. Queue  
D. Map

AW: D

---

## Question 4

Which collection type allows **duplicate elements and maintains order**?

A. Set  
B. List  
C. Queue  
D. TreeSet

AW: B

---

## Question 5

Which structure stores **key-value pairs**?

A. List  
B. Set  
C. Queue  
D. Map

AW: D

---

# True or False

Write **True** or **False**.

1. `ArrayList` implements the `List` interface.  AW: T
2. `Set` allows duplicate elements.  AW: F
3. `Map` stores elements using keys and values.  AW:T
4. `Queue` typically follows FIFO behavior.  AW:T
5. `Iterable` allows collections to be used in enhanced for-loops. AW: T

---

# Short Answer

## Question 1

What is the difference between an **interface** and a **class** in the Java Collections Framework?

AW: Defines behavior

---

## Question 2

Why is it recommended to declare variables using interfaces like `List` instead of concrete classes like `ArrayList`?

Example:

```java
List<String> list = new ArrayList<>();

AW: Because it allows flexibility.

````

---

## Question 3

Name three interfaces that extend `Collection`.

---

# Code Reading Exercise

Look at the code below.

```java
List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");

for (String fruit : fruits) {
    System.out.println(fruit);
}
```

Questions:

1. Which interface type is used for the variable? AW: List
2. Which class is used as the implementation? AW: ArrayList
3. Why can the enhanced for-loop be used here? 

AW: Because List implements Iterable, Iterable allows the collection to be looped through.

---

# Coding Exercise

Create a small program that demonstrates the following:

1. A **List** that stores three names.
2. A **Set** that stores unique numbers.
3. A **Queue** that stores three tasks.
4. A **Map** that stores student names and grades.

Print the contents of each structure.

        // List example
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sarah");
        names.add("Mike");

        System.out.println("List: " + names);

        // Set example
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Set: " + numbers);

        // Queue example
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Email client");
        tasks.offer("Fix bug");
        tasks.offer("Deploy code");

        System.out.println("Queue: " + tasks);

        // Map example
        Map<String, Integer> grades = new HashMap<>();
        grades.put("John", 90);
        grades.put("Sarah", 85);
        grades.put("Mike", 88);

        System.out.println("Map: " + grades);


---

# Challenge Exercise

Write a program that:

1. Creates a **List of student names**
2. Creates a **Set of unique course names**
3. Creates a **Queue of tasks**
4. Creates a **Map that stores student → grade**

Then:

* Print each structure
* Add one new element to each structure
* Print them again

```
```
