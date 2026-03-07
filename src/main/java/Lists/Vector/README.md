````markdown
# Vector

## What Is Vector?

`Vector` is a **resizable array implementation** of the `List` interface.

It:
- Maintains insertion order
- Allows duplicate elements
- Supports index-based access
- Is **synchronized (thread-safe)**

⚠ `Vector` is considered a **legacy class**. Modern Java code usually uses `ArrayList` instead.

```java
import java.util.Vector;
import java.util.List;

List<String> items = new Vector<>();
````

---

## Where It Fits

```
Iterable
   ↓
Collection
   ↓
List
   ↓
Vector
```

⚠ `Stack` extends `Vector`.

---

## How It Works

* Backed by a **dynamic array**
* Automatically resizes when capacity is exceeded
* Methods are **synchronized**, meaning thread-safe
* Slightly slower than `ArrayList` due to synchronization overhead

---

## ⏱ Time Complexity

| Operation             | Complexity     |
| --------------------- | -------------- |
| `get(index)`          | O(1)           |
| `set(index)`          | O(1)           |
| `add(element)`        | O(1) amortized |
| `add(index, element)` | O(n)           |
| `remove(index)`       | O(n)           |
| `contains()`          | O(n)           |

Performance is similar to `ArrayList`, but slower due to synchronization.

---

## Core Methods

```java
vector.add("Apple");          // add to end
vector.add(0, "Banana");      // insert at index

vector.get(0);                // access element
vector.set(1, "Orange");      // update element

vector.remove(0);             // remove by index
vector.remove("Apple");       // remove by value

vector.size();
vector.isEmpty();
vector.contains("Apple");
```

---

## What Does “Synchronized” Mean?

All major methods are **thread-safe**.

This means:

* Multiple threads can safely modify the vector
* Internal locking prevents data corruption

However, this makes operations slightly slower.

---

## Common Mistakes

* Using `Vector` in single-threaded applications (unnecessary overhead)
* Confusing `Vector` with `ArrayList`
* Forgetting it is a legacy class

---

## Vector vs ArrayList

| Feature      | Vector | ArrayList |
| ------------ | ------ | --------- |
| Thread-safe  | Yes    | No        |
| Performance  | Slower | Faster    |
| Modern usage | Rare   | Preferred |
| Legacy       | Yes    | No        |

---

## When To Use Vector

Use it when:

* You need built-in thread safety
* Maintaining legacy systems

Avoid it when:

* Writing modern applications
* Thread safety is not required

---

## Practice Ideas

* Compare performance of `Vector` vs `ArrayList`
//Vector is synchronized, so every operation has thread-safety overhead.
 // ArrayList is unsynchronized, so it’s faster in single-threaded

import java.util.*;

public class VectorVsArrayList {
public static void main(String[] args) {
int n = 1_000_000;

        Vector<Integer> vector = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Measure Vector
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) vector.add(i);
        long end = System.currentTimeMillis();
        System.out.println("Vector time: " + (end - start) + " ms");

        // Measure ArrayList
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) arrayList.add(i);
        end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start) + " ms");
    }
}
* Convert legacy `Vector` code to `ArrayList`

Legacy code may use Vector for storing elements:
Vector<String> vec = new Vector<>();
vec.add("Alice");
vec.add("Bob");
Convert to modern ArrayList:
List<String> list = new ArrayList<>();
list.add("Alice");
list.add("Bob");

* Simulate multi-threaded access (advanced)
//Vector is synchronized automatically.
//  ArrayList is not thread-safe, so concurrent access can cause issues.

import java.util.*;
import java.util.concurrent.*;

public class MultiThreadDemo {
public static void main(String[] args) throws InterruptedException {
List<Integer> vector = new Vector<>();
List<Integer> arrayList = new ArrayList<>();
int n = 1000;

        Runnable taskVector = () -> {
            for (int i = 0; i < n; i++) vector.add(i);
        };

        Runnable taskArrayList = () -> {
            for (int i = 0; i < n; i++) arrayList.add(i);
        };

        // Vector threads
        Thread t1 = new Thread(taskVector);
        Thread t2 = new Thread(taskVector);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Vector size: " + vector.size()); // usually 2000, safe

        // ArrayList threads (unsafe)
        t1 = new Thread(taskArrayList);
        t2 = new Thread(taskArrayList);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("ArrayList size: " + arrayList.size()); // may be < 2000, race condition
    }
}
//Vector handles thread safety automatically.
//ArrayList requires external synchronization 
//(e.g., Collections.synchronizedList) for safe concurrent access.
---

## Summary

Vector = **thread-safe dynamic array (legacy)**.

Modern best practice:

* Use `ArrayList` for most applications
* Use concurrency utilities instead of relying on `Vector`.

```
```
