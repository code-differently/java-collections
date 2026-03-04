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
* Implement a stack using LinkedList
* Remove duplicates manually
* Insert element after every occurrence of X
* Simulate browser history navigation

---

## Summary

LinkedList = **node-based, flexible, fast inserts/removals, slow index access**.

Use it when structure flexibility matters more than fast random reads.

```
```
