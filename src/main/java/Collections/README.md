```markdown
# Collection

## What Is Collection?

`Collection` is the **core interface** of the Java Collections Framework.

It represents a **group of objects**.

It is the parent of:
- `List`
- `Set`
- `Queue`

⚠ `Map` is NOT a Collection.

---

## Where It Fits

```

Iterable
↓
Collection
↓
List / Set / Queue

````

Every `List`, `Set`, and `Queue` is a `Collection`.

---

## What Collection Provides

`Collection` defines common behaviors shared by all collections.

Core methods:

```java
collection.add(element);
collection.remove(element);
collection.contains(element);

collection.size();
collection.isEmpty();
collection.clear();

collection.addAll(otherCollection);
collection.removeAll(otherCollection);
collection.retainAll(otherCollection);
````

---

## Looping

Because `Collection` extends `Iterable`, you can loop through it:

```java
for (String item : collection) {
    System.out.println(item);
}
```

---

## Time Complexity

Depends on implementation:

| Operation    | Typical Complexity |
| ------------ | ------------------ |
| `add()`      | O(1) or O(n)       |
| `remove()`   | O(1) or O(n)       |
| `contains()` | O(1) or O(n)       |
| `size()`     | O(1)               |

⚠ The actual complexity depends on whether it’s a `List`, `Set`, or `Queue`.

---

## Collection vs List

| Feature             | Collection     | List |
| ------------------- | -------------- | ---- |
| Ordered?            | Not guaranteed | Yes  |
| Index-based access? | No             | Yes  |
| Allows duplicates?  | Depends        | Yes  |

`Collection` does NOT support indexing.

---

## Best Practice

Use the interface as your reference type:

```java
Collection<String> items = new ArrayList<>();
```

This allows flexibility:
You can switch to `HashSet` or `LinkedList` later without changing much code.

---

## Common Mistakes

* Thinking `Collection` supports indexing
* Assuming ordering exists
* Forgetting `Map` is separate from Collection

---

## Practice Ideas

* Write a method that accepts `Collection<Integer>` and returns the sum
* Find intersection of two collections
* Remove duplicates using a Set
* Determine if one collection is a subset of another

---

## Summary

Collection = **the shared foundation for List, Set, and Queue**.

It provides:

* Core add/remove/search operations
* Looping capability
* Bulk operations (`addAll`, `retainAll`, etc.)

Understanding `Collection` helps you understand what all collections have in common.

```
```
