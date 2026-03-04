````markdown
# 📘 LinkedHashMap (Condensed Guide)

## 🧠 What Is LinkedHashMap?

`LinkedHashMap` is a **Map implementation that maintains insertion order**.

It:
- Stores **key-value pairs**
- Maintains **the order elements were added**
- Allows **one null key**
- Allows **multiple null values**

```java
import java.util.LinkedHashMap;
import java.util.Map;

Map<String, Integer> scores = new LinkedHashMap<>();
````

---

## 📌 Where It Fits

```
Map
 ↓
HashMap
 ↓
LinkedHashMap
```

`LinkedHashMap` extends `HashMap` but adds **ordering behavior**.

---

## ⚙️ How It Works

`LinkedHashMap` uses:

* A **hash table** (like HashMap) for fast lookup
* A **doubly linked list** to maintain insertion order

Because of this:

* Lookups remain fast
* Iteration follows insertion order

---

## ⏱ Time Complexity

| Operation       | Complexity   |
| --------------- | ------------ |
| `put()`         | O(1) average |
| `get()`         | O(1) average |
| `remove()`      | O(1) average |
| `containsKey()` | O(1)         |

Performance is very similar to `HashMap`.

---

## 🔑 Core Methods

### Add / Update

```java
map.put("Alice", 90);
map.put("Bob", 85);
```

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

## 🔁 Looping Through LinkedHashMap

Because it maintains insertion order:

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

Example output:

```
Alice -> 90
Bob -> 85
Charlie -> 92
```

The order matches the order elements were added.

---

## ⚠ Common Mistakes

* Assuming LinkedHashMap sorts keys (it does NOT)
* Forgetting that ordering is **insertion order**, not sorted order
* Using it when ordering does not matter (HashMap may be faster)

---

## 🆚 HashMap vs LinkedHashMap vs TreeMap

| Feature  | HashMap         | LinkedHashMap   | TreeMap     |
| -------- | --------------- | --------------- | ----------- |
| Order    | None            | Insertion order | Sorted      |
| Speed    | Fastest         | Slightly slower | Slower      |
| Use Case | General purpose | Maintain order  | Sorted keys |

---

## 🧪 When To Use LinkedHashMap

Use LinkedHashMap when:

* Order of insertion matters
* You want predictable iteration order
* You need HashMap speed but with ordering

Common examples:

* Caches
* Logs
* Maintaining user action history

---

## 💡 Example

```java
Map<String, Integer> scores = new LinkedHashMap<>();

scores.put("Alice", 90);
scores.put("Bob", 85);
scores.put("Charlie", 92);

System.out.println(scores);
```

Output:

```
{Alice=90, Bob=85, Charlie=92}
```

---

## 🧪 Practice Ideas

* Count word frequency while preserving order
* Build a simple cache
* Remove duplicates from a list while preserving order
* Track user activity history

---

## 🏁 Summary

LinkedHashMap = **HashMap with predictable iteration order**.

Key characteristics:

* Fast lookups
* Maintains insertion order
* Slightly more overhead than HashMap

Use it when you want **HashMap performance with consistent ordering**.

```
```
