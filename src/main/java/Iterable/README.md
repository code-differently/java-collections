````markdown
# Iterable (Condensed Guide)

## What Is Iterable?

`Iterable` is the **root interface** of the Java Collections Framework.

It represents anything that can be **looped over**.

If a class implements `Iterable`, it can be used in an enhanced for-loop:

```java
for (Type item : collection) {
    // use item
}
````

---

## Where It Fits

```
Iterable
   ↓
Collection
   ↓
List / Set / Queue
```

Every `List`, `Set`, and `Queue` is an `Iterable`.

---

## What Iterable Provides

`Iterable` defines one core method:

```java
Iterator<T> iterator();
```

This allows Java to retrieve elements one at a time.

---

## How the Enhanced For-Loop Works

This:

```java
for (String name : names) {
    System.out.println(name);
}
```

Is equivalent to:

```java
Iterator<String> it = names.iterator();

while (it.hasNext()) {
    String name = it.next();
    System.out.println(name);
}
```

The enhanced for-loop uses an `Iterator` behind the scenes.

---

## Iterator Core Methods

```java
it.hasNext();   // checks if another element exists
it.next();      // moves to next element
it.remove();    // safely removes current element
```

---

## Time Complexity

| Operation      | Complexity |
| -------------- | ---------- |
| Full traversal | O(n)       |

Where `n` = number of elements.

---

## ⚠ Common Mistakes

### Removing elements inside enhanced for-loop

```java
for (Integer n : list) {
    if (n % 2 == 0) {
        list.remove(n); // ❌ Causes ConcurrentModificationException
    }
}
```

### Correct way using Iterator

```java
Iterator<Integer> it = list.iterator();

while (it.hasNext()) {
    if (it.next() % 2 == 0) {
        it.remove();
    }
}
```

---

## When Iterable Matters

You care about `Iterable` when:

* Writing custom collections
* Enabling enhanced for-loops
* Needing controlled element traversal

---

## Example: Custom Iterable

```java
import java.util.Iterator;
import java.util.Arrays;

public class NumberBox implements Iterable<Integer> {

    private Integer[] numbers = {1, 2, 3};

    @Override
    public Iterator<Integer> iterator() {
        return Arrays.asList(numbers).iterator();
    }
}
```

Now this works:

```java
NumberBox box = new NumberBox();

for (int n : box) {
    System.out.println(n);
}
```

---

## Practice Ideas

* Write a method that accepts `Iterable<Integer>` and returns the sum
* Remove all odd numbers using `Iterator`
* Count elements greater than a value
* Create a simple custom class that implements `Iterable`

---

## Summary

Iterable = **the foundation of looping in Java Collections**.

If a class implements `Iterable`, it:

* Can be used in enhanced for-loops
* Provides an `Iterator`
* Enables safe traversal of elements

Understanding `Iterable` helps you understand how all collections are traversed.

```
```
