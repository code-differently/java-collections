````md
# Quiz.md

# Java Collections Framework Quiz — Collection Interface

## Instructions
Answer the following **10 questions** about the **Java `Collection` interface** and common collection methods.  
Select the **best answer** for each question.

---

## Question 1
Which of the following is **true** about the `Collection` interface?

A. `Collection` is a class  
B. `Collection` extends `List`  
**C. `Collection` is the root interface for most collection types**  
D. `Collection` only stores key-value pairs  

---

## Question 2
What will the following code print?

```java
Collection<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);

System.out.println(numbers.size());
````

A. 0
B. 1
**C. 3**
D. 30

---

## Question 3

Which method is used to **check if an element exists** inside a collection?

A. `search()`
B. `exists()`
**C. `contains()`**
D. `check()`

---

## Question 4

What will the following code print?

```java
Collection<String> names = new ArrayList<>();

names.add("Alex");
names.add("Jordan");

names.remove("Alex");

System.out.println(names);
```

A. `[Alex, Jordan]`
**B. `[Jordan]`**
C. `[Alex]`
D. `[]`

---

## Question 5

Which method adds **all elements from another collection** into an existing collection?

A. `add()`
**B. `addAll()`**
C. `insertAll()`
D. `merge()`

---

## Question 6

What will the following code print?

```java
Collection<Integer> numbers = new ArrayList<>();

System.out.println(numbers.isEmpty());
```

**A. `true`**
B. `false`
C. `0`
D. Compilation error

---

## Question 7

Which method removes **all elements** from a collection?

**A. `removeAll()`**
B. `deleteAll()`
C. `clear()`
D. `reset()`

---

## Question 8

What will the following code print?

```java
Collection<Integer> nums = new ArrayList<>();

nums.add(5);
nums.add(10);
nums.add(15);

for(Integer n : nums) {
    System.out.print(n + " ");
}
```

**A. `5 10 15`**
B. `15 10 5`
C. `0 1 2`
D. Compilation error

---

## Question 9

Which of the following **cannot be guaranteed** when using the `Collection` interface?

A. Elements can be added
B. Elements can be removed
**C. Indexed access using `.get(index)`**
D. Elements can be iterated using a loop

---

## Question 10

What is the **main benefit** of writing code like this?

```java
Collection<String> fruits = new ArrayList<>();
```

A. It automatically sorts the collection
B. It prevents duplicates
**C. It allows flexibility to change implementations later**
D. It forces the collection to be synchronized

```
```
