````markdown
# HashMap (Condensed Guide)

## What Is HashMap?

`HashMap` is a **Map implementation** that stores **key-value pairs**.

It:
- Uses **keys to quickly retrieve values**
- Does **not maintain ordering**
- Allows **one null key**
- Allows **multiple null values**

```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> scores = new HashMap<>();
````

---

## Where It Fits

```
Map
 ↓
HashMap
```

⚠ `Map` is **not part of the Collection hierarchy**, but it is part of the Java Collections Framework.

---

## How It Works

`HashMap` stores data using **hashing**.

Steps when storing data:

1. The key’s `hashCode()` is calculated
2. The hash determines a **bucket location**
3. The value is stored at that location

Because of hashing:

* Lookups are extremely fast
* Keys must implement proper `equals()` and `hashCode()`

---

## Time Complexity

| Operation       | Complexity   |
| --------------- | ------------ |
| `put()`         | O(1) average |
| `get()`         | O(1) average |
| `remove()`      | O(1) average |
| `containsKey()` | O(1)         |

Worst case (rare collisions) → O(n)

---

## Core Methods

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

## Looping Through a HashMap

### Using entrySet()

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

### Using keySet()

```java
for (String key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

---

## ⚠ Common Mistakes

* Expecting HashMap to maintain order
* Using mutable objects as keys
* Forgetting `equals()` and `hashCode()` rules

---

##  HashMap vs TreeMap vs LinkedHashMap

| Feature  | HashMap         | LinkedHashMap   | TreeMap     |
| -------- | --------------- | --------------- | ----------- |
| Order    | None            | Insertion order | Sorted      |
| Speed    | Fastest         | Slightly slower | Slower      |
| Use Case | General purpose | Maintain order  | Sorted keys |

---

## When To Use HashMap

Use HashMap when you need:

* Fast key lookups
* Data associations
* Frequency counting
* Caching or indexing

Common examples:

* Word frequency counters
* User ID → profile lookup
* Student name → grade mapping

---

## Example

```java
Map<String, Integer> wordCount = new HashMap<>();

wordCount.put("java", 3);
wordCount.put("python", 2);

System.out.println(wordCount.get("java"));
```

Output:

```
3
```

---

## Practice Ideas

* Count word frequencies in a sentence

Map<String, Integer> wordCount = new HashMap<>();
String sentence = "hello world hello java";

for (String word : sentence.split("\\s+")) {
wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}

System.out.println(wordCount); // {hello=2, world=1, java=1}

* Implement a phone directory

Map<String, String> phoneDirectory = new HashMap<>();

// Add contact
phoneDirectory.put("Alice", "123-456");

// Update
phoneDirectory.put("Alice", "987-654");

// Retrieve
System.out.println(phoneDirectory.get("Alice")); // 987-654

// Remove
phoneDirectory.remove("Alice");

* Find the first non-repeating character

String str = "swiss";
Map<Character, Integer> freq = new LinkedHashMap<>();

for (char c : str.toCharArray()) {
freq.put(c, freq.getOrDefault(c, 0) + 1);
}

for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
if (entry.getValue() == 1) {
System.out.println(entry.getKey()); // 'w'
break;
}
}

* Solve the Two-Sum problem

int[] nums = {2, 7, 11, 15};
int target = 9;
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
int complement = target - nums[i];
if (map.containsKey(complement)) {
System.out.println("Indices: " + map.get(complement) + ", " + i);
}
map.put(nums[i], i);
}
---

## Summary

HashMap = **fast key-value storage using hashing**.

Key characteristics:

* O(1) lookups
* No ordering
* Unique keys

Understanding HashMap is essential for solving many algorithm problems efficiently.

```
```
