````markdown
# HashSet (Condensed Guide)

## What Is HashSet?

`HashSet` is a `Set` implementation that stores **unique elements using hashing**.

Key characteristics:
- No duplicate elements
- No guaranteed ordering
- Allows **one null element**
- Fast lookup, insertion, and removal

```java
import java.util.Set;
import java.util.HashSet;

Set<Integer> numbers = new HashSet<>();
````

---

## Where It Fits

```
Iterable
 ↓
Collection
 ↓
Set
 ↓
HashSet
```

`HashSet` is one of the most commonly used implementations of the `Set` interface.

---

## How It Works

`HashSet` uses a **hash table** internally.

Steps when adding an element:

1. The element’s `hashCode()` is calculated
2. The hash determines a storage location
3. The element is placed into a bucket

Because of hashing:

* Searching is very fast
* Order of elements is **not predictable**

Example:

```
add(10)
add(20)
add(10)
```

Result:

```
10, 20
```

Duplicate values are ignored.

---

## Time Complexity

| Operation    | Complexity   |
| ------------ | ------------ |
| `add()`      | O(1) average |
| `remove()`   | O(1) average |
| `contains()` | O(1) average |

Worst case (many collisions) → O(n)

---

## Core Methods

```java
set.add(10);          // add element
set.remove(10);       // remove element
set.contains(10);     // check element
set.size();           // number of elements
set.isEmpty();        // check if empty
```

---

## Looping Through a HashSet

```java
for (Integer num : set) {
    System.out.println(num);
}
```

Because HashSet does not guarantee ordering, elements may appear in any order.

---

## HashSet vs LinkedHashSet vs TreeSet

| Feature  | HashSet        | LinkedHashSet          | TreeSet               |
| -------- | -------------- | ---------------------- | --------------------- |
| Order    | None           | Insertion order        | Sorted                |
| Speed    | Fastest        | Slightly slower        | Slower                |
| Use Case | Unique storage | Ordered unique storage | Sorted unique storage |

---

## When To Use HashSet

Use HashSet when you need:

* Unique elements
* Fast membership checking
* Removing duplicates

Examples:

* Unique usernames
* Removing duplicates from a list
* Tracking visited nodes in algorithms
* Fast lookup tables

---

## Example

```java
Set<String> fruits = new HashSet<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");

System.out.println(fruits);
```

Output:

```
[Apple, Banana]
```

The duplicate `"Apple"` is not stored.

---

## Practice Ideas

* Remove duplicates from a list

//Use a HashSet to remove duplicates (order not preserved) or a LinkedHashSet (order preserved):
import java.util.*;

List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers); // preserves order

System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]

* Count unique numbers in an array

//Just add all elements to a Set and check the size:
int[] arr = {1, 2, 2, 3, 4, 4, 5};
Set<Integer> unique = new HashSet<>();
for (int num : arr) {
unique.add(num);
}

System.out.println("Unique count: " + unique.size()); // Output: 5

* Track visited nodes in graph traversal

import java.util.*;

Map<Integer, List<Integer>> graph = Map.of(
1, Arrays.asList(2, 3),
2, Arrays.asList(4),
3, Arrays.asList(4),
4, Arrays.asList()
);

Set<Integer> visited = new HashSet<>();
Stack<Integer> stack = new Stack<>();
stack.push(1);

while (!stack.isEmpty()) {
int node = stack.pop();
if (!visited.contains(node)) {
visited.add(node);
for (int neighbor : graph.get(node)) {
stack.push(neighbor);
}
}
}

System.out.println("Visited nodes: " + visited); // Output: [1,2,3,4]

* Compare HashSet with TreeSet ordering
  //HashSet → unordered, fast O(1) lookup.
  //TreeSet → sorted, O(log n) lookup.
* 
  Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 1, 3, 2));
  Set<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 1, 3, 2));

System.out.println("HashSet: " + hashSet); // Output order may vary: [1, 2, 3, 5] or different
System.out.println("TreeSet: " + treeSet); // Output sorted: [1, 2, 3, 5]
---

## Summary
Use HashSet for fast lookup & uniqueness.
Use LinkedHashSet if you want insertion order preserved.
Use TreeSet if you want sorted order automatically.

HashSet is a **fast implementation of the Set interface that stores unique elements using hashing**.

Key characteristics:

* No duplicates
* No guaranteed ordering
* Very fast lookup and insertion

```
```
