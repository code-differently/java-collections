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
* Count unique numbers in an array
* Track visited nodes in graph traversal
* Compare HashSet with TreeSet ordering

---

## Summary

HashSet is a **fast implementation of the Set interface that stores unique elements using hashing**.

Key characteristics:

* No duplicates
* No guaranteed ordering
* Very fast lookup and insertion

```
```
