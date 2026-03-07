````markdown
# LinkedHashSet (Condensed Guide)

## What Is LinkedHashSet?

`LinkedHashSet` is a `Set` implementation that **stores unique elements while maintaining insertion order**.

Key characteristics:
- No duplicate elements
- Maintains **insertion order**
- Slightly slower than `HashSet`
- Allows **one null element**

```java
import java.util.Set;
import java.util.LinkedHashSet;

Set<String> names = new LinkedHashSet<>();
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
 ↓
LinkedHashSet
```

`LinkedHashSet` extends `HashSet` but adds **ordering behavior**.

---

## How It Works

`LinkedHashSet` uses:

* A **hash table** (like `HashSet`) for fast lookups
* A **doubly linked list** to maintain insertion order

This allows:

* Fast operations
* Predictable iteration order

Example:

```
add("A")
add("B")
add("C")
```

Iteration order:

```
A, B, C
```

---

## Time Complexity

| Operation    | Complexity   |
| ------------ | ------------ |
| `add()`      | O(1) average |
| `remove()`   | O(1) average |
| `contains()` | O(1) average |

Performance is similar to `HashSet`, with a small overhead for maintaining order.

---

## Core Methods

```java
set.add("Apple");
set.remove("Apple");
set.contains("Apple");
set.size();
set.isEmpty();
```

---

## Looping Through a LinkedHashSet

```java
for (String name : set) {
    System.out.println(name);
}
```

Elements will appear **in the order they were inserted**.

---

## HashSet vs LinkedHashSet vs TreeSet

| Feature     | HashSet                | LinkedHashSet   | TreeSet         |
| ----------- | ---------------------- | --------------- | --------------- |
| Ordering    | None                   | Insertion order | Sorted          |
| Performance | Fastest                | Slightly slower | Slower          |
| Use Case    | General unique storage | Maintain order  | Sorted elements |

---

## When To Use LinkedHashSet

Use LinkedHashSet when you need:

* Unique elements
* Predictable insertion order
* Fast lookup operations

Examples:

* Removing duplicates while preserving order
* Tracking unique user actions
* Maintaining ordered unique logs

---

## Example

```java
Set<String> fruits = new LinkedHashSet<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple");

System.out.println(fruits);
```

Output:

```
[Apple, Banana]
```

The duplicate `"Apple"` is ignored, and the insertion order is preserved.

---

## Practice Ideas

* Remove duplicates from a list while preserving order

import java.util.*;

public class RemoveDuplicatesExample {
public static void main(String[] args) {
List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        // Use LinkedHashSet to remove duplicates while preserving order
        LinkedHashSet<String> uniqueItems = new LinkedHashSet<>(items);

        // Convert back to list if needed
        List<String> result = new ArrayList<>(uniqueItems);

        System.out.println(result); // Output: [apple, banana, orange]
    }
}
* Store unique usernames in insertion order

import java.util.*;

public class UniqueUsernames {
public static void main(String[] args) {
LinkedHashSet<String> usernames = new LinkedHashSet<>();

        usernames.add("alice");
        usernames.add("bob");
        usernames.add("charlie");
        usernames.add("alice"); // duplicate, ignored

        System.out.println(usernames); // Output: [alice, bob, charlie]
    }
}
* Track unique visited pages

import java.util.*;

public class VisitedPages {
public static void main(String[] args) {
LinkedHashSet<String> visitedPages = new LinkedHashSet<>();

        visitedPages.add("home.html");
        visitedPages.add("about.html");
        visitedPages.add("contact.html");
        visitedPages.add("home.html"); // duplicate, ignored

        System.out.println("Visited pages in order:");
        for (String page : visitedPages) {
            System.out.println(page);
        }
        // Output:
        // home.html
        // about.html
        // contact.html
    }
}
---

## Summary

LinkedHashSet is a **Set implementation that preserves insertion order while ensuring uniqueness**.

Key characteristics:

* No duplicates
* Maintains insertion order
* Fast lookup using hashing

```
```
