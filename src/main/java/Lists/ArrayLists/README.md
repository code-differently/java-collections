````markdown
# 📘 ArrayList

## What Is ArrayList?

`ArrayList` is a resizable array implementation of the `List` interface.

It:
- Maintains insertion order
- Allows duplicates
- Supports index-based access
- Grows dynamically

```java
import java.util.ArrayList;
import java.util.List;

List<String> names = new ArrayList<>();
````

---

##  Where It Fits

```
Iterable → Collection → List → ArrayList
```

---

## How It Works

* Backed by a dynamic array
* Resizes automatically when capacity is exceeded
* Fast random access
* Slower for insertions/removals in the middle

---

## Time Complexity

| Operation             | Complexity     |
| --------------------- | -------------- |
| `get(index)`          | O(1)           |
| `set(index)`          | O(1)           |
| `add(element)`        | O(1) amortized |
| `add(index, element)` | O(n)           |
| `remove(index)`       | O(n)           |
| `contains()`          | O(n)           |

---

## Core Methods

```java
list.add("Apple");        // add to end
list.add(0, "Banana");    // insert at index

list.get(0);              // access
list.set(1, "Orange");    // update

list.remove(0);           // remove by index
list.remove("Apple");     // remove by value

list.size();
list.isEmpty();
list.contains("Apple");
```

---

## Looping

```java
for (String item : list) {
    System.out.println(item);
}
```

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

## Common Mistakes

* Using `<=` instead of `<` in loops
* Removing elements inside enhanced for-loop
* Confusing capacity with size

---

## When To Use ArrayList

Use it when:

* You need fast index access
* You mostly add to the end
* You want predictable order

Avoid it when:

* You frequently insert/remove at the beginning or middle
* You need uniqueness (use `Set`)

---

## Practice Ideas

* Reverse a list
* Remove duplicates
* Rotate list by k
* Find second largest number
* Two-sum problem

---

### Summary

ArrayList = **ordered, resizable, fast reads, slower middle inserts/removals**.

Mastering when to use it vs LinkedList is key.

```
```
