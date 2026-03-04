````markdown
# TreeMap (Condensed Guide)

## What Is TreeMap?

`TreeMap` is a `Map` implementation that stores key-value pairs in **sorted order based on the keys**.

It:
- Stores data as **key-value pairs**
- Automatically **sorts keys**
- Does **not allow null keys**
- Allows multiple null values

```java
import java.util.Map;
import java.util.TreeMap;

Map<String, Integer> scores = new TreeMap<>();
````

---

## Where It Fits

```
Map
 ↓
SortedMap
 ↓
NavigableMap
 ↓
TreeMap
```

TreeMap implements both `SortedMap` and `NavigableMap`.

---

## How It Works

`TreeMap` is implemented using a **Red-Black Tree**, a type of self-balancing binary search tree.

This means:

* Keys are always stored in **sorted order**
* Insertions maintain tree balance
* Lookups are efficient but slower than `HashMap`

Sorting can occur:

* Using **natural ordering** (e.g., alphabetical, numerical)
* Using a **custom comparator**

---

## Time Complexity

| Operation       | Complexity |
| --------------- | ---------- |
| `put()`         | O(log n)   |
| `get()`         | O(log n)   |
| `remove()`      | O(log n)   |
| `containsKey()` | O(log n)   |

TreeMap is slower than `HashMap` because it maintains sorting.

---

## Core Methods

### Add / Update

```java
map.put("Alice", 90);
map.put("Bob", 85);
map.put("Charlie", 92);
```

Keys will automatically appear in sorted order.

---

### Access Value

```java
map.get("Alice");
```

---

### Remove Entry

```java
map.remove("Bob");
```

---

### Check Key

```java
map.containsKey("Alice");
```

---

### Size

```java
map.size();
```

---

## SortedMap Features

### First and Last Keys

```java
map.firstKey();
map.lastKey();
```

---

### Submap (Range of Keys)

```java
map.subMap("A", "M");
```

Returns keys between `"A"` and `"M"`.

---

## NavigableMap Features

### Closest Keys

```java
map.higherKey("Bob");   // next higher key
map.lowerKey("Bob");    // next lower key
```

### Ceiling / Floor

```java
map.ceilingKey("Bob");  // smallest key >= "Bob"
map.floorKey("Bob");    // largest key <= "Bob"
```

---

## Looping Through TreeMap

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

Output will always be **sorted by key**.

---

## HashMap vs LinkedHashMap vs TreeMap

| Feature      | HashMap        | LinkedHashMap   | TreeMap     |
| ------------ | -------------- | --------------- | ----------- |
| Ordering     | None           | Insertion order | Sorted      |
| Lookup Speed | O(1)           | O(1)            | O(log n)    |
| Null Keys    | 1 allowed      | 1 allowed       | Not allowed |
| Use Case     | General lookup | Maintain order  | Sorted keys |

---

## When To Use TreeMap

Use TreeMap when:

* You need **sorted keys**
* You need **range queries**
* You need **ordered iteration**

Examples:

* Leaderboards
* Sorted indexes
* Time-based event storage
* Range searching

---

## Example

```java
Map<Integer, String> students = new TreeMap<>();

students.put(3, "Alice");
students.put(1, "Bob");
students.put(2, "Charlie");

System.out.println(students);
```

Output:

```
{1=Bob, 2=Charlie, 3=Alice}
```

Keys are automatically sorted.

---

## Practice Ideas

* Store numbers and return them in sorted order
* Build a leaderboard sorted by score
* Find the closest value to a target number
* Return elements in a range using `subMap()`

---

## Summary

TreeMap is a **sorted map implementation backed by a balanced tree**.

Key characteristics:

* Keys automatically sorted
* O(log n) operations
* Supports range queries and navigation methods

Use TreeMap when ordered keys or range operations are required.

```
```
