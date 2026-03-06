````markdown
# Practice Exercises: Java Collections Hierarchy

These exercises help reinforce understanding of the **Java Collections Framework hierarchy** and the relationships between its core interfaces and implementations.

---

# Multiple Choice

## Question 1

Which interface allows an object to be used in an enhanced for-loop?

A. Collection  
**B. Iterable B**  
C. List  
D. Queue

---

## Question 2

Which interface is the parent of `List`, `Set`, and `Queue`?

A. Iterable  
**B. Collection**  
C. Map  
D. Deque

---

## Question 3

Which of the following is **NOT part of the Collection hierarchy**?

A. List  
B. Set  
C. Queue  
**D. Map**

---

## Question 4

Which collection type allows **duplicate elements and maintains order**?

A. Set  
**B. List**  
C. Queue  
D. TreeSet

---

## Question 5

Which structure stores **key-value pairs**?

A. List  
B. Set  
C. Queue  
**D. Map**

---

# True or False

Write **True** or **False**.

1. `ArrayList` implements the `List` interface.   **True**
2. `Set` allows duplicate elements.  **False**
3. `Map` stores elements using keys and values.  **True**
4. `Queue` typically follows FIFO behavior.  **True**
5. `Iterable` allows collections to be used in enhanced for-loops. **True**

---

# Short Answer

## Question 1

What is the difference between an **interface** and a **class** in the Java Collections Framework?

Interface defines behaviors, class implement those behaviors 

---

## Question 2

Why is it recommended to declare variables using interfaces like `List` instead of concrete classes like `ArrayList`?

More flexibility and repurposability in the future

Example:

```java
List<String> list = new ArrayList<>();
````

---

## Question 3

Name three interfaces that extend `Collection`.

List, Set, Queue

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
3. Why can the enhanced for-loop be used here? Because ArrayLists are iterable

---

# Coding Exercise

Create a small program that demonstrates the following:

1. A **List** that stores three names.
2. A **Set** that stores unique numbers.
3. A **Queue** that stores three tasks.
4. A **Map** that stores student names and grades.

Print the contents of each structure.

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
