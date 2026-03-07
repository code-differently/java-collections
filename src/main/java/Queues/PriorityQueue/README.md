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

//Use a min-heap (PriorityQueue) to efficiently get smallest numbers:
import java.util.*;

List<Integer> numbers = Arrays.asList(7, 2, 5, 3, 9);
int k = 3;

PriorityQueue<Integer> minHeap = new PriorityQueue<>(numbers);
List<Integer> kSmallest = new ArrayList<>();

for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
kSmallest.add(minHeap.poll());
}

System.out.println(kSmallest); // Output: [2, 3, 5]
// PriorityQueue automatically keeps elements sorted in natural order (min at top).

* Implement a task scheduler

//Use a priority queue where tasks have priority (smaller number = higher priority):
  class Task implements Comparable<Task> {
  String name;
  int priority;

  Task(String name, int priority) {
  this.name = name;
  this.priority = priority;
  }

  @Override
  public int compareTo(Task other) {
  return Integer.compare(this.priority, other.priority);
  }
  }

PriorityQueue<Task> tasks = new PriorityQueue<>();
tasks.offer(new Task("Write report", 2));
tasks.offer(new Task("Email client", 1));
tasks.offer(new Task("Update code", 3));

while (!tasks.isEmpty()) {
Task t = tasks.poll();
System.out.println("Processing: " + t.name + " (priority " + t.priority + ")");
}
// Output processes tasks in priority order: Email client, Write report, Update code

* Build a leaderboard system

//Use a max-heap (PriorityQueue with comparator) to get top scores:
PriorityQueue<Integer> leaderboard = new PriorityQueue<>(Collections.reverseOrder());
leaderboard.add(90);
leaderboard.add(75);
leaderboard.add(95);

System.out.println(leaderboard.poll()); // 95
System.out.println(leaderboard.poll()); // 90
// Collections.reverseOrder() makes it a max-heap instead of min-heap.

* Merge multiple sorted lists

//Use a priority queue to efficiently merge k sorted lists:
List<List<Integer>> lists = List.of(
List.of(1, 4, 7),
List.of(2, 5, 8),
List.of(3, 6, 9)
);

PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
// Store {value, listIndex, elementIndex} in heap
for (int i = 0; i < lists.size(); i++) {
if (!lists.get(i).isEmpty()) {
pq.offer(new int[]{lists.get(i).get(0), i, 0});
}
}

List<Integer> merged = new ArrayList<>();
while (!pq.isEmpty()) {
int[] top = pq.poll();
merged.add(top[0]);
int listIndex = top[1], elemIndex = top[2];
if (elemIndex + 1 < lists.get(listIndex).size()) {
pq.offer(new int[]{lists.get(listIndex).get(elemIndex + 1), listIndex, elemIndex + 1});
}
}

System.out.println(merged); // Output: [1,2,3,4,5,6,7,8,9]
//This is the classic k-way merge using a heap.
---

## Summary

PriorityQueue is a **heap-based queue that processes elements by priority instead of insertion order**.

Key characteristics:

* Highest priority element removed first
* Efficient O(log n) insert/remove
* Supports custom ordering using comparators

```
```
