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

import java.util.*;

public class Practice1 {
public static void main(String[] args) {
List<String> words = Arrays.asList("apple","banana","apple","orange");
LinkedHashMap<String, Integer> freqMap = new LinkedHashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqMap); // Output: {apple=2, banana=1, orange=1}
    }
}

* Build a simple cache

import java.util.*;

public class Practice2 {
public static void main(String[] args) {
LinkedHashMap<Integer, String> cache = new LinkedHashMap<Integer, String>(3, 0.75f, false) {
protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
return size() > 3; // remove oldest entry when size > 3
}
};

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.put(4, "D"); // 1 will be removed

        System.out.println(cache); // Output: {2=B, 3=C, 4=D}
    }
}

* Remove duplicates from a list while preserving order

import java.util.*;

public class Practice3 {
public static void main(String[] args) {
List<Integer> list = Arrays.asList(1,2,3,2,1,4);
LinkedHashMap<Integer, Boolean> uniqueMap = new LinkedHashMap<>();

        for (Integer num : list) {
            uniqueMap.put(num, true); // only keeps first occurrence
        }

        List<Integer> result = new ArrayList<>(uniqueMap.keySet());
        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}

* Track user activity history

import java.util.*;

public class Practice4 {
public static void main(String[] args) {
LinkedHashMap<String, String> userActivity = new LinkedHashMap<>();

        userActivity.put("user1", "Login");
        userActivity.put("user2", "View Page");
        userActivity.put("user1", "Upload File"); // updates value but preserves insertion order
        userActivity.put("user3", "Logout");

        for (Map.Entry<String, String> entry : userActivity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Output:
        // user1 -> Upload File
        // user2 -> View Page
        // user3 -> Logout
    }
}
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
