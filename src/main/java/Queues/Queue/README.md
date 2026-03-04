````markdown
# Queue (Condensed Guide)

## What Is a Queue?

A `Queue` is a data structure that follows the **First-In, First-Out (FIFO)** principle.

The first element added is the first one removed.

Think of it like a line at a store:
- The first person in line gets served first.

Common implementations:
- `LinkedList`
- `ArrayDeque`
- `PriorityQueue` (special ordering)

```java
import java.util.Queue;
import java.util.LinkedList;

Queue<String> queue = new LinkedList<>();
````

---

## Where It Fits

```
Iterable
 ↓
Collection
 ↓
Queue
```

Classes that commonly implement `Queue` include:

* `LinkedList`
* `ArrayDeque`
* `PriorityQueue`

---

## How It Works

Queue operations occur at two ends:

Front (Head) → Element removed
Back (Tail) → Element inserted

Example:

```
add(1)
add(2)
add(3)

remove() → 1
remove() → 2
remove() → 3
```

---

## Time Complexity

Typical implementations (`LinkedList`, `ArrayDeque`):

| Operation | Complexity |
| --------- | ---------- |
| `offer()` | O(1)       |
| `poll()`  | O(1)       |
| `peek()`  | O(1)       |

Queue operations are usually constant time.

---

## Core Methods

### Add Element

```java
queue.add("A");     // throws exception if it fails
queue.offer("B");   // returns false if it fails
```

---

### Remove Element

```java
queue.remove();     // throws exception if empty
queue.poll();       // returns null if empty
```

---

### View Front Element

```java
queue.element();    // throws exception if empty
queue.peek();       // returns null if empty
```

---

## Looping Through a Queue

```java
for (String item : queue) {
    System.out.println(item);
}
```

---

## Common Mistakes

* Calling `remove()` on an empty queue
* Expecting LIFO behavior (that is Stack behavior)
* Confusing `PriorityQueue` with FIFO queues

---

## Queue vs Stack

| Feature | Queue | Stack |
| ------- | ----- | ----- |
| Order   | FIFO  | LIFO  |
| Insert  | Back  | Top   |
| Remove  | Front | Top   |

Queue processes elements in the order they arrive.

---

## When To Use Queue

Use Queue when processing tasks in order, such as:

* Task scheduling
* Printer job management
* Breadth-first search (BFS)
* Customer service systems
* Message processing systems

---

## Example

```java
Queue<Integer> numbers = new LinkedList<>();

numbers.offer(10);
numbers.offer(20);
numbers.offer(30);

System.out.println(numbers.poll());
```

Output:

```
10
```

The first element added is the first removed.

---

## Practice Ideas

* Simulate a printer queue
* Process customer service requests
* Implement a ticketing system
* Perform breadth-first search on a graph

---

## Summary

Queue is a **FIFO data structure used for ordered processing of elements**.

Key characteristics:

* Elements added at the back
* Elements removed from the front
* Common implementations include `LinkedList` and `ArrayDeque`

```
```
