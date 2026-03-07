````markdown
# Queue (Condensed Guide)

## What Is a Queue?

A `Queue` is a data structure that follows the **First-In, First-Out (FIFO)** principle.

The first element added is the first one removed.

Think of it like a line at a store:
- The first person in line gets served first.

Common implementations:
- `LinkedList`
- `ArrayDeque`
- `PriorityQueue` (special ordering)

```java
import java.util.Queue;
import java.util.LinkedList;

Queue<String> queue = new LinkedList<>();
````

---

## Where It Fits

```
Iterable
 ↓
Collection
 ↓
Queue
```

Classes that commonly implement `Queue` include:

* `LinkedList`
* `ArrayDeque`
* `PriorityQueue`

---

## How It Works

Queue operations occur at two ends:

Front (Head) → Element removed
Back (Tail) → Element inserted

Example:

```
add(1)
add(2)
add(3)

remove() → 1
remove() → 2
remove() → 3
```

---

## Time Complexity

Typical implementations (`LinkedList`, `ArrayDeque`):

| Operation | Complexity |
| --------- | ---------- |
| `offer()` | O(1)       |
| `poll()`  | O(1)       |
| `peek()`  | O(1)       |

Queue operations are usually constant time.

---

## Core Methods

### Add Element

```java
queue.add("A");     // throws exception if it fails
queue.offer("B");   // returns false if it fails
```

---

### Remove Element

```java
queue.remove();     // throws exception if empty
queue.poll();       // returns null if empty
```

---

### View Front Element

```java
queue.element();    // throws exception if empty
queue.peek();       // returns null if empty
```

---

## Looping Through a Queue

```java
for (String item : queue) {
    System.out.println(item);
}
```

---

## Common Mistakes

* Calling `remove()` on an empty queue
* Expecting LIFO behavior (that is Stack behavior)
* Confusing `PriorityQueue` with FIFO queues

---

## Queue vs Stack

| Feature | Queue | Stack |
| ------- | ----- | ----- |
| Order   | FIFO  | LIFO  |
| Insert  | Back  | Top   |
| Remove  | Front | Top   |

Queue processes elements in the order they arrive.

---

## When To Use Queue

Use Queue when processing tasks in order, such as:

* Task scheduling
* Printer job management
* Breadth-first search (BFS)
* Customer service systems
* Message processing systems

---

## Example

```java
Queue<Integer> numbers = new LinkedList<>();

numbers.offer(10);
numbers.offer(20);
numbers.offer(30);

System.out.println(numbers.poll());
```

Output:

```
10
```

The first element added is the first removed.

---

## Practice Ideas

* Simulate a printer queue

LinkedHashMap<Integer, String> printerQueue = new LinkedHashMap<>();
printerQueue.put(101, "Document1.pdf");
printerQueue.put(102, "Report.docx");

// Process first job
Integer firstJobId = printerQueue.keySet().iterator().next();
String firstJob = printerQueue.remove(firstJobId);
System.out.println("Printing: " + firstJob);

* Process customer service requests

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomerServiceQueue {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> requests = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int nextRequestId = 1;

        while (true) {
            System.out.println("\n1. Add Request");
            System.out.println("2. Update Request");
            System.out.println("3. Process Next Request");
            System.out.println("4. Show All Requests");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter customer info / request description: ");
                    String info = scanner.nextLine();
                    requests.put(nextRequestId, info);
                    System.out.println("Request added with ID: " + nextRequestId);
                    nextRequestId++;
                    break;

                case 2:
                    System.out.print("Enter request ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (requests.containsKey(updateId)) {
                        System.out.print("Enter new details: ");
                        String newInfo = scanner.nextLine();
                        requests.put(updateId, newInfo); // updates value
                        System.out.println("Request " + updateId + " updated.");
                    } else {
                        System.out.println("Request ID not found.");
                    }
                    break;

                case 3:
                    if (!requests.isEmpty()) {
                        int firstId = requests.keySet().iterator().next();
                        String firstRequest = requests.remove(firstId);
                        System.out.println("Processing request ID " + firstId + ": " + firstRequest);
                    } else {
                        System.out.println("No requests to process.");
                    }
                    break;

                case 4:
                    System.out.println("All pending requests:");
                    for (Map.Entry<Integer, String> entry : requests.entrySet()) {
                        System.out.println("ID " + entry.getKey() + " -> " + entry.getValue());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

* Implement a ticketing system

LinkedHashMap<Integer, String> tickets = new LinkedHashMap<>();
tickets.put(1, "UserA - Issue1");
tickets.put(2, "UserB - Issue2");

// Resolve ticket 1
tickets.remove(1);
System.out.println(tickets); // Output: {2=UserB - Issue2}

* Perform breadth-first search on a graph

LinkedHashMap<String, Boolean> visited = new LinkedHashMap<>();
Queue<String> queue = new LinkedList<>();

visited.put("A", true);
queue.add("A");

while(!queue.isEmpty()) {
String node = queue.poll();
System.out.println("Visiting: " + node);
// Add neighbors if not visited
}
---

## Summary

Queue is a **FIFO data structure used for ordered processing of elements**.

Key characteristics:

* Elements added at the back
* Elements removed from the front
* Common implementations include `LinkedList` and `ArrayDeque`

```
```
