````markdown
# TreeSet (Condensed Guide)

## What Is TreeSet?

`TreeSet` is a `Set` implementation that **stores unique elements in sorted order**.

Key characteristics:
- No duplicate elements
- Elements are automatically **sorted**
- Does **not allow null elements**
- Uses a **balanced tree structure** internally

```java
import java.util.Set;
import java.util.TreeSet;

Set<Integer> numbers = new TreeSet<>();
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
SortedSet
 ↓
NavigableSet
 ↓
TreeSet
```

TreeSet implements both `SortedSet` and `NavigableSet`.

---

## How It Works

`TreeSet` is implemented using a **Red-Black Tree**, a type of self-balancing binary search tree.

This ensures:

* Elements remain **sorted**
* Insertions and removals maintain tree balance
* Efficient searching

Example:

```
add(30)
add(10)
add(20)
```

Result:

```
10, 20, 30
```

Elements are automatically sorted.

---

## Time Complexity

| Operation    | Complexity |
| ------------ | ---------- |
| `add()`      | O(log n)   |
| `remove()`   | O(log n)   |
| `contains()` | O(log n)   |

TreeSet is slower than HashSet because it maintains sorted order.

---

## Core Methods

```java
set.add(10);
set.add(20);
set.add(30);

set.remove(20);
set.contains(10);
set.size();
```

---

## SortedSet Features

TreeSet allows operations related to ordering.

### First and Last Elements

```java
set.first();
set.last();
```

---

### Subsets

```java
set.subSet(10, 50);
```

Returns elements within the specified range.

---

## NavigableSet Features

### Find Closest Elements

```java
set.higher(20);   // smallest element greater than 20
set.lower(20);    // largest element less than 20
```

### Ceiling and Floor

```java
set.ceiling(20);  // smallest element ≥ 20
set.floor(20);    // largest element ≤ 20
```

---

## Looping Through a TreeSet

```java
for (Integer num : set) {
    System.out.println(num);
}
```

Elements will always appear **in sorted order**.

---

## TreeSet vs HashSet vs LinkedHashSet

| Feature   | HashSet    | LinkedHashSet     | TreeSet       |
| --------- | ---------- | ----------------- | ------------- |
| Order     | None       | Insertion order   | Sorted        |
| Speed     | Fastest    | Slightly slower   | Slower        |
| Structure | Hash table | Hash table + list | Balanced tree |

---

## When To Use TreeSet

Use TreeSet when you need:

* Automatically **sorted unique elements**
* **Range queries**
* **Closest value searches**

Examples:

* Leaderboards
* Sorted indexes
* Range filtering

---

## Example

```java
Set<Integer> numbers = new TreeSet<>();

numbers.add(50);
numbers.add(10);
numbers.add(30);

System.out.println(numbers);
```

Output:

```
[10, 30, 50]
```

The elements are stored in sorted order.

---

## Practice Ideas

* Store numbers and automatically sort them

import java.util.*;

public class SortedNumbersExample {
public static void main(String[] args) {
TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(7); // duplicate ignored

        System.out.println(numbers); // Output: [7, 19, 42]
    }
}
* Find the smallest and largest elements

import java.util.*;

public class MinMaxExample {
public static void main(String[] args) {
TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(10, 5, 20, 15));

        int smallest = numbers.first();
        int largest = numbers.last();

        System.out.println("Smallest: " + smallest); // 5
        System.out.println("Largest: " + largest);   // 20
    }
}
* Retrieve values within a range

import java.util.*;

public class RangeExample {
public static void main(String[] args) {
TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(10, 5, 20, 15, 25));

        // Retrieve numbers between 10 (inclusive) and 20 (inclusive)
        SortedSet<Integer> range = numbers.subSet(10, true, 20, true);

        System.out.println(range); // Output: [10, 15, 20]
    }
}import java.util.*;

public class UniqueScores {
public static void main(String[] args) {
TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(76);
        scores.add(85); // duplicate ignored

        System.out.println("Sorted unique scores: " + scores);
        // Output: [76, 85, 92]
    }
}
* Track unique sorted scores

import java.util.*;

public class UniqueScores {
public static void main(String[] args) {
TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(76);
        scores.add(85); // duplicate ignored

        System.out.println("Sorted unique scores: " + scores);
        // Output: [76, 85, 92]
    }
}
---

## Summary

TreeSet is a **sorted Set implementation backed by a balanced tree**.

Key characteristics:

* Unique elements only


* Automatically sorted
* O(log n) operations
* Supports range and navigation operations

```
```
