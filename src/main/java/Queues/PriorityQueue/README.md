````markdown
# PriorityQueue (Condensed Guide)

## What Is PriorityQueue?

`PriorityQueue` is a `Queue` implementation where elements are processed based on **priority instead of insertion order**.

Elements with **higher priority are removed first**.

By default:
- The **smallest element has the highest priority** (min-heap behavior).

```java
import java.util.PriorityQueue;
import java.util.Queue;

Queue<Integer> pq = new PriorityQueue<>();
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
PriorityQueue
```

`PriorityQueue` implements the `Queue` interface.

---

## How It Works

`PriorityQueue` is implemented using a **binary heap**.

This means:

* The smallest element is always at the front
* Elements are automatically reordered when inserted
* The queue is **not sorted when iterating**

Example:

```
add(5)
add(2)
add(8)

poll() → 2
poll() → 5
poll() → 8
```

---

## Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| `offer()` | O(log n)   |
| `poll()`  | O(log n)   |
| `peek()`  | O(1)       |
| `add()`   | O(log n)   |

The heap structure keeps operations efficient.

---

## Core Methods

### Add Element

```java
pq.offer(10);
pq.offer(5);
pq.offer(20);
```

---

### View Highest Priority Element

```java
pq.peek();
```

Returns the smallest element.

---

### Remove Highest Priority Element

```java
pq.poll();
```

Removes the element with the highest priority.

---

### Check Size

```java
pq.size();
```

---

## Example

```java
Queue<Integer> pq = new PriorityQueue<>();

pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll());
System.out.println(pq.poll());
System.out.println(pq.poll());
```

Output:

```
10
20
30
```

Elements are removed in priority order.

---

## Custom Priority (Comparator)

You can define custom priority rules.

Example: Max-heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(
    (a, b) -> b - a
);
```

Now the **largest element comes first**.

---

## Common Mistakes

* Assuming iteration returns sorted order
* Forgetting that the smallest element has highest priority by default
* Expecting FIFO behavior like a normal queue

---

## PriorityQueue vs Queue

| Feature   | Queue          | PriorityQueue    |
| --------- | -------------- | ---------------- |
| Ordering  | FIFO           | Priority-based   |
| Removal   | First inserted | Highest priority |
| Structure | Linear         | Heap             |

---

## When To Use PriorityQueue

Use it when tasks must be processed by priority, such as:

* Task scheduling
* Job processing systems
* Dijkstra’s algorithm
* A* search
* Finding top K elements

---

## Practice Ideas

* Find the K smallest numbers
* Implement a task scheduler
* Build a leaderboard system
* Merge multiple sorted lists

---

## Summary

PriorityQueue is a **heap-based queue that processes elements by priority instead of insertion order**.

Key characteristics:

* Highest priority element removed first
* Efficient O(log n) insert/remove
* Supports custom ordering using comparators

```
```
