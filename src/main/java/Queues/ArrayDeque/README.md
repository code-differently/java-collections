````markdown
# ArrayDeque (Condensed Guide)

## What Is ArrayDeque?

`ArrayDeque` is a **resizable array implementation of the `Deque` interface**.

It can function as both:
- A **Queue (FIFO)**  
- A **Stack (LIFO)**

It is typically **faster than `Stack` and `LinkedList` for stack and queue operations**.

```java
import java.util.ArrayDeque;
import java.util.Deque;

Deque<Integer> deque = new ArrayDeque<>();
````

---

## Where It Fits

```
Iterable
 ↓
Collection
 ↓
Queue
 ↓
Deque
 ↓
ArrayDeque
```

`ArrayDeque` implements the `Deque` interface, which supports operations at both ends.

---

## How It Works

`ArrayDeque` uses a **dynamic circular array** internally.

This allows:

* Fast insertions/removals at both ends
* Efficient memory usage
* No shifting of elements like `ArrayList`

Important rule:

* `ArrayDeque` **does NOT allow null elements**.

---

## Time Complexity

| Operation       | Complexity |
| --------------- | ---------- |
| `addFirst()`    | O(1)       |
| `addLast()`     | O(1)       |
| `removeFirst()` | O(1)       |
| `removeLast()`  | O(1)       |
| `peekFirst()`   | O(1)       |
| `peekLast()`    | O(1)       |

Most operations run in constant time.

---

## Core Methods

### Add Elements

```java
deque.addFirst(10);
deque.addLast(20);
```

---

### Remove Elements

```java
deque.removeFirst();
deque.removeLast();
```

---

### Peek Elements

```java
deque.peekFirst();
deque.peekLast();
```

---

## Using ArrayDeque as a Queue (FIFO)

```java
Deque<Integer> queue = new ArrayDeque<>();

queue.offerLast(1);
queue.offerLast(2);
queue.offerLast(3);

queue.pollFirst(); // 1
```

First element inserted is first removed.

---

## Using ArrayDeque as a Stack (LIFO)

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(1);
stack.push(2);
stack.push(3);

stack.pop(); // 3
```

Last element inserted is first removed.

---

## Common Mistakes

* Trying to store `null` values (not allowed)
* Confusing `addFirst()` vs `addLast()`
* Using `Stack` when `ArrayDeque` is preferred

---

## ArrayDeque vs LinkedList

| Feature       | ArrayDeque    | LinkedList   |
| ------------- | ------------- | ------------ |
| Memory usage  | Lower         | Higher       |
| Performance   | Faster        | Slower       |
| Null elements | Not allowed   | Allowed      |
| Use case      | Stack / Queue | General list |

---

## When To Use ArrayDeque

Use ArrayDeque when you need:

* A **fast stack implementation**
* A **fast queue implementation**
* Operations at **both ends of a structure**

Examples:

* Breadth-first search
* Undo/redo systems
* Task scheduling
* Parentheses checking

---

## Example

```java
Deque<String> tasks = new ArrayDeque<>();

tasks.addLast("Task1");
tasks.addLast("Task2");
tasks.addLast("Task3");

System.out.println(tasks.removeFirst());
```

Output:

```
Task1
```

---

## Practice Ideas

* Implement a stack using ArrayDeque
* Reverse a string using a stack
* Simulate a queue of tasks
* Check balanced parentheses

---

## Summary

ArrayDeque is a **high-performance implementation of a double-ended queue**.

Key characteristics:

* Fast operations at both ends
* Can be used as stack or queue
* Does not allow null values

It is generally the **preferred structure for stack and queue behavior in modern Java**.

```
```
