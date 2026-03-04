````markdown
# Map Basics (Condensed Guide)

## What Is a Map?

A `Map` is a data structure that stores **key-value pairs**.

Each **key** maps to exactly **one value**.

Rules:
- Keys must be **unique**
- Values **can be duplicated**
- Each key points to one value

Example:

```java
Key → Value
"John" → 90
"Alice" → 85
"Bob" → 78
````

---

## Where It Fits

```
Map
 ↓
HashMap
LinkedHashMap
TreeMap
```

⚠ `Map` is **not part of the Collection hierarchy**, but it is part of the Java Collections Framework.

---

## Why Maps Are Useful

Maps allow you to **look up data quickly using a key**.

Examples:

* Username → Password
* Student → Grade
* Word → Frequency
* Product ID → Product

---

## Creating a Map

```java
import java.util.Map;
import java.util.HashMap;

Map<String, Integer> scores = new HashMap<>();
```

Best practice: **use the interface type (`Map`)**.

---

## 🔑 Core Map Methods

### Add or Update

```java
map.put("Alice", 90);
map.put("Bob", 85);
```

If the key already exists, the value is replaced.

---

### Access a Value

```java
map.get("Alice");
```

Returns the value associated with the key.

---

### Remove an Entry

```java
map.remove("Bob");
```

---

### Check for a Key

```java
map.containsKey("Alice");
```

---

### Check for a Value

```java
map.containsValue(90);
```

---

### Get Map Size

```java
map.size();
```

---

## Looping Through a Map

### Using `entrySet()` (Most Common)

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

### Using `keySet()`

```java
for (String key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

---

### Looping Values Only

```java
for (Integer value : map.values()) {
    System.out.println(value);
}
```

---

## Time Complexity (Typical)

| Operation       | Complexity   |
| --------------- | ------------ |
| `put()`         | O(1) average |
| `get()`         | O(1) average |
| `remove()`      | O(1) average |
| `containsKey()` | O(1)         |

Actual performance depends on the implementation (`HashMap`, `TreeMap`, etc.).

---

## ⚠ Common Mistakes

* Expecting duplicate keys
* Forgetting `get()` returns `null` if key not found
* Confusing `keySet()` with `entrySet()`

---

## Practice Ideas

* Count word frequencies in a sentence
* Store student names and grades
* Build a phone directory
* Find the most frequent number in a list

---

## Summary

Map = **a structure that stores key-value relationships**.

Key characteristics:

* Unique keys
* Fast lookups
* Multiple implementations (`HashMap`, `LinkedHashMap`, `TreeMap`)

Understanding Maps is essential for solving many real-world programming problems.

```
```
