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
* Convert legacy `Vector` code to `ArrayList`
* Simulate multi-threaded access (advanced)

---

## Summary

Vector = **thread-safe dynamic array (legacy)**.

Modern best practice:

* Use `ArrayList` for most applications
* Use concurrency utilities instead of relying on `Vector`.

```
```
