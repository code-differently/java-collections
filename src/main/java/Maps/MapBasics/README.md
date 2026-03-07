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

import java.util.*;

public class WordFrequencyDemo {
public static void main(String[] args) {
String sentence = "apple banana apple orange banana apple";
String[] words = sentence.split(" ");

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }//Use getOrDefault(key, defaultValue) to simplify counting

        System.out.println(freq); 
        // Output: {orange=1, banana=2, apple=3}
    }
}
* Store student names and grades

Map<String, Integer> studentGrades = new HashMap<>();
studentGrades.put("Alice", 90);
studentGrades.put("Bob", 85);
studentGrades.put("Charlie", 95);

System.out.println(studentGrades);
// Output: {Alice=90, Bob=85, Charlie=95}
💡// Use LinkedHashMap  to preserve insertion order.


* Build a phone directory

Map<String, String> phoneDirectory = new HashMap<>();
phoneDirectory.put("Alice", "123-456-7890");
phoneDirectory.put("Bob", "987-654-3210");

System.out.println(phoneDirectory);
// Output: {Alice=123-456-7890, Bob=987-654-3210}
//Use Map<String, List<String>> if a person has multiple numbers.

* Find the most frequent number in a list
//Use a Map to count occurrences and then find the max.

List<Integer> numbers = Arrays.asList(1,3,2,3,4,3);

Map<Integer, Integer> freq = new HashMap<>();
for (Integer num : numbers) {
freq.put(num, freq.getOrDefault(num, 0) + 1);
}

int mostFrequent = numbers.get(0);
int maxCount = 0;

for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
if (entry.getValue() > maxCount) {
maxCount = entry.getValue();
mostFrequent = entry.getKey();
}
}

System.out.println("Most frequent: " + mostFrequent); // Output: 3
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
