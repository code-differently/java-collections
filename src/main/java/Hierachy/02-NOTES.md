````markdown
# Java Collections Hierarchy Notes

## Purpose of the Collections Framework

The **Java Collections Framework** provides a standardized architecture for storing and manipulating groups of objects.

Benefits include:
- Reusable data structures
- Improved performance
- Consistent interfaces across structures
- Easier algorithm implementation

---

## Key Design Idea

The framework is built around **interfaces and implementations**.

Interfaces define **what operations are possible**.  
Classes define **how those operations are implemented**.

Example:

```java
List<String> list = new ArrayList<>();
````

* `List` → interface
* `ArrayList` → implementation

This design allows developers to change implementations without changing much code.

---

## Core Hierarchy

```
Iterable
   ↓
Collection
   ↓
List / Set / Queue
```

All collection types can be **iterated** because they ultimately implement `Iterable`.

---

## Iterable

The root interface that enables looping.

Key method:

```java
Iterator<T> iterator();
```

This allows structures to work with:

```java
for (Type item : collection)
```

---

## Collection

Represents a **group of objects**.

Common methods available to all collections:

```java
add()
remove()
contains()
size()
isEmpty()
clear()
```

The `Collection` interface is extended by:

* `List`
* `Set`
* `Queue`

---

## List

An ordered collection.

Characteristics:

* Maintains insertion order
* Allows duplicate elements
* Supports index-based access

Examples:

* `ArrayList`
* `LinkedList`
* `Vector`
* `Stack`

---

## Set

A collection that **does not allow duplicates**.

Characteristics:

* Each element must be unique
* Ordering depends on the implementation

Examples:

* `HashSet` → no guaranteed order
* `LinkedHashSet` → maintains insertion order
* `TreeSet` → sorted order

---

## Queue

A collection used to process elements in order.

Typical behavior:

**FIFO (First In, First Out)**

Examples:

* `PriorityQueue`
* `ArrayDeque`
* `LinkedList`

---

## Map (Special Case)

`Map` is part of the Collections Framework but **does not extend Collection**.

It stores **key-value pairs** instead of individual elements.

Rules:

* Keys must be unique
* Values may be duplicated

Examples:

* `HashMap`
* `LinkedHashMap`
* `TreeMap`

---

## Why Use Interfaces Instead of Classes

Prefer this:

```java
List<Integer> numbers = new ArrayList<>();
```

Instead of:

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

Benefits:

* Flexibility
* Easier code maintenance
* Better software design

---

## Big Picture

The Java Collections Framework helps developers efficiently store and manage data.

Understanding the hierarchy makes it easier to:

* Choose the correct structure
* Write flexible code
* Understand algorithm behavior

```
```
