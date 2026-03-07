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
Answer : B
---

## Question 2

Which interface is the parent of `List`, `Set`, and `Queue`?

A. Iterable  
B. Collection  
C. Map  
D. Deque
Answer: B
---

## Question 3

Which of the following is **NOT part of the Collection hierarchy**?

A. List  
B. Set  
C. Queue  
D. Map
Answer: D
---

## Question 4

Which collection type allows **duplicate elements and maintains order**?

A. Set  
B. List  
C. Queue  
D. TreeSet
Answer: B
---

## Question 5

Which structure stores **key-value pairs**?

A. List  
B. Set  
C. Queue  
D. Map
Answer: D
---

# True or False

Write **True** or **False**.

1. `ArrayList` implements the `List` interface.  True
2. `Set` allows duplicate elements.  False
3. `Map` stores elements using keys and values.  True
4. `Queue` typically follows FIFO behavior.  True
5. `Iterable` allows collections to be used in enhanced for-loops.True

---

# Short Answer

## Question 1

What is the difference between an **interface** and a **class** in the Java Collections Framework?
Interfaces define behavior.  
Classes implement those behaviors.
---

## Question 2

Why is it recommended to declare variables using interfaces like `List` instead of concrete classes like `ArrayList`?
Because it provides flexibility, abstraction, and better code design
Example:

```java
List<String> list = new ArrayList<>();
````

---

## Question 3

Name three interfaces that extend `Collection`.
List, Set & Queue
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

1. Which interface type is used for the variable? List
2. Which class is used as the implementation? ArrayList
3. Why can the enhanced for-loop be used here? List extend Collections which extends Iterable

---

# Coding Exercise

Create a small program that demonstrates the following:

1. A **List** that stores three names.
2. A **Set** that stores unique numbers.
3. A **Queue** that stores three tasks.
4. A **Map** that stores student names and grades.

import java.util.*;

public class CollectionsDemo {
public static void main(String[] args) {

        // 1. List of three names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("List of names: " + names);

        // 2. Set of unique numbers
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // duplicate ignored
        System.out.println("Set of unique numbers: " + numbers);

        // 3. Queue of three tasks
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");
        System.out.println("Queue of tasks: " + tasks);

        // 4. Map of student names and grades
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 95);
        System.out.println("Map of student grades: " + studentGrades);
    }
}
//Print the contents of each structure.

List of names: [Alice, Bob, Charlie]
Set of unique numbers: [20, 10]   // order may vary
Queue of tasks: [Task 1, Task 2, Task 3]
Map of student grades: {Alice=90, Bob=85, Charlie=95}  // order may vary
----------

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
  import java.util.*;

public class CollectionsExercise {
public static void main(String[] args) {

        // 1. List of student names
        List<String> students = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        System.out.println("Initial List of students: " + students);

        // Add a new student
        students.add("David");
        System.out.println("List after adding a student: " + students);
        System.out.println();

        // 2. Set of unique course names
        Set<String> courses = new HashSet<>(Arrays.asList("Math", "Science", "History"));
        System.out.println("Initial Set of courses: " + courses);

        // Add a new course
        courses.add("English");
        System.out.println("Set after adding a course: " + courses);
        System.out.println();

        // 3. Queue of tasks
        Queue<String> tasks = new LinkedList<>(Arrays.asList("Homework", "Project", "Study"));
        System.out.println("Initial Queue of tasks: " + tasks);

        // Add a new task
        tasks.offer("Review");
        System.out.println("Queue after adding a task: " + tasks);
        System.out.println();

        // 4. Map of student → grade
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 95);
        System.out.println("Initial Map of student grades: " + studentGrades);

        // Add a new student and grade
        studentGrades.put("David", 88);
        System.out.println("Map after adding a student: " + studentGrades);
    }
}
```
```
