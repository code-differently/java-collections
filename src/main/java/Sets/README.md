````markdown
# Set (Condensed Guide)

## What Is a Set?

A `Set` is a collection that **does not allow duplicate elements**.

Key characteristics:
- Stores **unique elements only**
- Does **not support indexing**
- Ordering depends on the implementation

Common implementations:
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

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
```

Implementations include:

```
Set
 ↓
HashSet
LinkedHashSet
TreeSet
```

---

## How It Works

A `Set` ensures every element is **unique**.

If you try to insert a duplicate element, it will **not be added**.

Example:

```
add(10)
add(20)
add(20)
add(30)
```

Result:

```
10, 20, 30
```

The duplicate `20` is ignored.

---

## Time Complexity (Typical HashSet)

| Operation    | Complexity   |
| ------------ | ------------ |
| `add()`      | O(1) average |
| `remove()`   | O(1) average |
| `contains()` | O(1) average |

Actual performance depends on the implementation.

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

## Looping Through a Set

```java
for (Integer num : set) {
    System.out.println(num);
}
```

Sets do not support `get(index)` because they are not indexed.

---

## Set Implementations

| Implementation  | Behavior                     |
| --------------- | ---------------------------- |
| `HashSet`       | No ordering                  |
| `LinkedHashSet` | Maintains insertion order    |
| `TreeSet`       | Automatically sorts elements |

---

## Set vs List

| Feature      | List            | Set                       |
| ------------ | --------------- | ------------------------- |
| Duplicates   | Allowed         | Not allowed               |
| Ordering     | Maintains order | Depends on implementation |
| Index access | Yes             | No                        |

---

## When To Use Set

Use a Set when you need:

* Unique values
* Fast membership checks
* Removing duplicates from data

Examples:

* Unique usernames
* Tracking visited items
* Removing duplicate values from lists

---

## Summary

Set is a **collection that stores unique elements**.

Key characteristics:

* No duplicate elements
* No indexing
* Different implementations provide different ordering behavior

```
```
