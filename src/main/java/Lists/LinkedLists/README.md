````markdown
# LinkedList

## What Is LinkedList?

`LinkedList` is a **doubly linked list implementation** of the `List` interface.

It:
- Maintains insertion order
- Allows duplicates
- Does NOT provide fast index access
- Can also function as a Queue or Deque

```java
import java.util.LinkedList;
import java.util.List;

List<String> names = new LinkedList<>();
````

---

## Where It Fits

```
Iterable → Collection → List → LinkedList
                           ↘
                            Deque → Queue
```

`LinkedList` implements both:

* `List`
* `Deque` (which extends `Queue`)

---

## How It Works

* Built from **nodes**
* Each node stores:

    * Data
    * Reference to next node
    * Reference to previous node
* No shifting of elements required

Because it uses nodes:

* Fast insertions/removals at beginning or middle
* Slow random index access

---

## Time Complexity

| Operation                        | Complexity |
| -------------------------------- | ---------- |
| `get(index)`                     | O(n)       |
| `set(index)`                     | O(n)       |
| `add(element)`                   | O(1) (end) |
| `addFirst()` / `addLast()`       | O(1)       |
| `add(index, element)`            | O(n)       |
| `removeFirst()` / `removeLast()` | O(1)       |
| `contains()`                     | O(n)       |

---

## Core Methods (List Behavior)

```java
list.add("Apple");           // add to end
list.add(0, "Banana");       // insert at index

list.get(0);                 // access (slow)
list.set(1, "Orange");       // update

list.remove(0);              // remove by index
list.remove("Apple");        // remove by value
```

---

## Core Methods (Deque / Queue Behavior)

```java
LinkedList<String> queue = new LinkedList<>();

queue.addFirst("A");
queue.addLast("B");

queue.removeFirst();
queue.removeLast();

queue.peekFirst();
queue.peekLast();
```

---

## Looping

Enhanced for-loop:

```java
for (String item : list) {
    System.out.println(item);
}
```

Traditional loop (slower due to indexing):

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i)); // O(n) each time
}
```

⚠ Using index-based loops repeatedly makes it O(n²).

---

## Common Mistakes

* Using `get(i)` in large loops (slow)
* Assuming it has fast random access
* Forgetting it can act as a Queue or Deque

---

## ArrayList vs LinkedList

| Feature       | ArrayList     | LinkedList               |
| ------------- | ------------- | ------------------------ |
| Random Access | O(1)          | O(n)                     |
| Insert Middle | O(n)          | Faster                   |
| Remove Middle | O(n)          | Faster                   |
| Memory Usage  | Lower         | Higher                   |
| Best For      | Reading often | Frequent inserts/removes |

---

## When To Use LinkedList

Use it when:

* You frequently insert/remove at the beginning
* You need Queue or Deque behavior
* You do not rely on heavy index access

Avoid it when:

* You frequently access by index
* You need fast random reads

---

## Practice Ideas

* Implement a queue using LinkedList
// LinkedList naturally supports FIFO, so you can use offer() to enqueue and poll() to dequeue.
LinkedList<String> queue = new LinkedList<>();

// Enqueue
queue.offer("Task1");
queue.offer("Task2");

// Dequeue
System.out.println(queue.poll()); // Task1
System.out.println(queue.poll()); // Task2

* Implement a stack using LinkedList
//LinkedList can also act as a stack (LIFO) using push() and pop().
LinkedList<Integer> stack = new LinkedList<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop()); // 30
System.out.println(stack.pop()); // 20

* Remove duplicates manually

LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,2,3,3,3,4));
for (int i = 0; i < list.size(); i++) {
for (int j = i + 1; j < list.size(); j++) {
if (list.get(i).equals(list.get(j))) {
list.remove(j);
j--; // adjust index after removal
}
}
}
System.out.println(list); // [1, 2, 3, 4]

* Insert element after every occurrence of X

LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,2,4));
int X = 2;
int valueToInsert = 99;

ListIterator<Integer> iter = list.listIterator();
while (iter.hasNext()) {
if (iter.next() == X) {
iter.add(valueToInsert);
}
}
System.out.println(list); // [1, 2, 99, 3, 2, 99, 4]

* Simulate browser history navigation

LinkedList<String> history = new LinkedList<>();
history.add("google.com");
history.add("stackoverflow.com");
history.add("github.com");

int currentIndex = history.size() - 1; // last visited page

// Back
if (currentIndex > 0) currentIndex--;
System.out.println(history.get(currentIndex)); // stackoverflow.com

// Forward
if (currentIndex < history.size() - 1) currentIndex++;
System.out.println(history.get(currentIndex)); // github.com
---

## Summary

LinkedList = **node-based, flexible, fast inserts/removals, slow index access**.

Use it when structure flexibility matters more than fast random reads.

```
```
