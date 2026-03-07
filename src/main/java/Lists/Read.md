````markdown
# List (Condensed Guide)

## What Is a List?

A `List` is an **ordered collection** that allows **duplicate elements**.

Key characteristics:
- Maintains **insertion order**
- Allows **duplicate values**
- Supports **index-based access**
- Elements can be added, removed, or updated by position

Common implementations:
- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

```java
import java.util.List;
import java.util.ArrayList;

List<String> names = new ArrayList<>();
````

---

## Where It Fits

```
Iterable
 ↓
Collection
 ↓
List
```

Implementations include:

```
List
 ↓
ArrayList
LinkedList
Vector
Stack
```

---

## How It Works

A `List` stores elements **in a specific order**.

Example:

```
add("Apple")
add("Banana")
add("Cherry")
```

Result:

```
[Apple, Banana, Cherry]
```

Each element has an **index position** starting from `0`.

---

## Time Complexity (Typical)

Depends on the implementation.

### ArrayList

| Operation       | Complexity     |
| --------------- | -------------- |
| `get(index)`    | O(1)           |
| `add(element)`  | O(1) amortized |
| `remove(index)` | O(n)           |

### LinkedList

| Operation       | Complexity |
| --------------- | ---------- |
| `get(index)`    | O(n)       |
| `addFirst()`    | O(1)       |
| `removeFirst()` | O(1)       |

---

## Core Methods

```java
list.add("Apple");        // add element
list.add(0, "Banana");    // insert at index

list.get(0);              // access element
list.set(0, "Orange");    // update element

list.remove(0);           // remove element

list.size();              // number of elements
list.isEmpty();           // check if empty
```

---

## Looping Through a List

Enhanced for-loop:

```java
for (String item : list) {
    System.out.println(item);
}
```

Index-based loop:

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

## List vs Set

| Feature      | List            | Set                       |
| ------------ | --------------- | ------------------------- |
| Duplicates   | Allowed         | Not allowed               |
| Ordering     | Maintains order | Depends on implementation |
| Index access | Yes             | No                        |

---

## When To Use List

Use a List when you need:

* Ordered data
* Duplicate elements
* Index-based access
* Sequential processing

Examples:

* Storing names
* Managing playlists
* Processing ordered data
* Maintaining history logs

---

## Example

```java
List<String> fruits = new ArrayList<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");

System.out.println(fruits.get(1));
```

Output:

```
Banana
```

---

## Practice Ideas

* Reverse a list

public static List<Integer> reverseList(List<integer> list){
Collections.reserse(list);
return list;

-------or:
public static List<Integer> reverseList<List<Integer> list){

Collection<Integer> result = new ArrayList<>();
for( int x = list.size()-1; x>=0; x--){
return result.list.get(x);
}


* Find the second largest number

public static int findSecondLargestNum(List<Integer>() numbers){
Set<Integer> unique = new HasSet<>(numbers);
List<Integer> list= new ArrayList<>(unique);
Collections.sort(list);
resul.get(list.size()-2);
}



* Remove duplicates from a list

public static List<integer> removeDuplicate(List<>() numbers){
return new ArrayList<>(new HasSet<>(numbers));
)
* Merge two lists
* 
public static List<Integer>  mergeTwoLists(List<Integer> a, List<Integer> b){
List<Integer> result = new ArrayList<>(a);
result.AddAll(b);
return result;
}

---

## Summary

List is an **ordered collection that allows duplicates and supports index-based access**.

Key characteristics:

* Maintains insertion order
* Allows duplicate elements
* Provides indexing operations

```
```
