```markdown
# Java Collections Hierarchy Overview

Before learning individual collections, it is important to understand how the **Java Collections Framework is organized**.

This section introduces the **structure of the framework** and how the major interfaces and classes relate to each other.

Understanding the hierarchy helps developers:
- Choose the correct data structure
- Write flexible code using interfaces
- Understand why certain methods exist in some structures but not others

---

# The Java Collections Hierarchy

The Collections Framework is organized around **interfaces and implementations**.

Interfaces define behavior.  
Classes implement those behaviors.

```


    Iterable
    ↓
    Collection
    ↓
    List      Set       Queue
    ↓        ↓         ↓
    ArrayList HashSet   PriorityQueue
    LinkedList LinkedHashSet
    Vector    TreeSet
    Stack

```

Important note:

```

    Map
    ↓
HashMap
LinkedHashMap
TreeMap

```

`Map` is part of the Java Collections Framework but **does not extend Collection**.

---

# Key Interfaces

## Iterable

Root interface for anything that can be looped over.

Provides:

```

Iterator<T> iterator();

```

Allows enhanced for-loops.

---

## Collection

Represents a **group of objects**.

Common methods:

```

add()
remove()
contains()
size()
clear()

````

Extended by:
- List
- Set
- Queue

---

## List

An **ordered collection**.

Characteristics:
- Allows duplicates
- Maintains insertion order
- Supports indexing

Examples:

- ArrayList
- LinkedList
- Vector
- Stack

---

## Set

A collection that **does not allow duplicates**.

Examples:

- HashSet
- LinkedHashSet
- TreeSet

---

## Queue

A collection designed for **processing elements in order**.

Common behavior:
- FIFO (First In First Out)

Examples:

- PriorityQueue
- ArrayDeque
- LinkedList

---

## Map

Stores **key-value pairs**.

Key characteristics:

- Keys must be unique
- Values can duplicate

Examples:

- HashMap
- LinkedHashMap
- TreeMap

---

# Why Interfaces Matter

Instead of writing:

```java
ArrayList<String> list = new ArrayList<>();
````

Prefer:

```java
List<String> list = new ArrayList<>();
```

Benefits:

* More flexible code
* Easy to swap implementations
* Better design practices

---

# Summary

The Java Collections Framework is built on **interfaces and implementations**.

Key concepts:

* Iterable enables looping
* Collection defines core behaviors
* List provides ordered collections
* Set prevents duplicates
* Queue processes elements in order
* Map stores key-value relationships

Understanding this hierarchy makes it easier to choose the right data structure.

```
```
