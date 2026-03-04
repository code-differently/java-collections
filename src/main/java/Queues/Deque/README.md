````markdown
# Deque (Condensed Guide)

## What Is Deque?

`Deque` stands for **Double-Ended Queue**.

It is an interface that allows elements to be **added or removed from both the front and the back** of a structure.

Because of this, a `Deque` can function as:
- A **Queue (FIFO)**
- A **Stack (LIFO)**

Common implementations:
- `ArrayDeque`
- `LinkedList`

```java
import java.util.Deque;
import java.util.ArrayDeque;

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
```

Classes that implement `Deque` include:

* `ArrayDeque`
* `LinkedList`

---

## How It Works

A `Deque` allows operations on **both ends of the structure**.

Front (Head) ←→ Back (Tail)

You can:

* Insert at the front
* Insert at the back
* Remove from the front
* Remove from the back

This flexibility allows it to behave as both a **stack and queue**.

---

## Time Complexity

Typical implementations like `ArrayDeque`:

| Operation       | Complexity |
| --------------- | ---------- |
| `addFirst()`    | O(1)       |
| `addLast()`     | O(1)       |
| `removeFirst()` | O(1)       |
| `removeLast()`  | O(1)       |
| `peekFirst()`   | O(1)       |
| `peekLast()`    | O(1)       |

Operations are generally constant time.

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

## Using Deque as a Queue (FIFO)

```java
Deque<Integer> queue = new ArrayDeque<>();

queue.offerLast(1);
queue.offerLast(2);
queue.offerLast(3);

queue.pollFirst(); // 1
```

First element added is the first removed.

---

## Using Deque as a Stack (LIFO)

```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(1);
stack.push(2);
stack.push(3);

stack.pop(); // 3
```

Last element added is the first removed.

---

## Common Mistakes

* Confusing `Deque` with `Queue`
* Using `Stack` instead of `Deque`
* Forgetting that both ends can be used

---

## Deque vs Queue

| Feature           | Queue | Deque |
| ----------------- | ----- | ----- |
| Insert at front   | No    | Yes   |
| Insert at back    | Yes   | Yes   |
| Remove from front | Yes   | Yes   |
| Remove from back  | No    | Yes   |

Deque is more flexible than a standard Queue.

---

## When To Use Deque

Use Deque when you need:

* Operations at both ends of a structure
* A fast stack implementation
* A fast queue implementation

Common use cases:

* Browser history navigation
* Undo/redo systems
* Sliding window algorithms
* Task scheduling

---

## Example

```java
Deque<String> tasks = new ArrayDeque<>();

tasks.addFirst("Task1");
tasks.addLast("Task2");

System.out.println(tasks.removeFirst());
```

Output:

```
Task1
```

---

## Practice Ideas

* Implement a stack using Deque
* Implement a queue using Deque
* Reverse elements using Deque
* Build a browser history system

---

## Summary

Deque is a **double-ended queue that allows insertion and removal from both ends**.

Key characteristics:

* More flexible than a Queue
* Can act as both stack and queue
* Implemented by structures like `ArrayDeque` and `LinkedList`

```
```
