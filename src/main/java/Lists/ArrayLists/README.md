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

public static List<Integer> reverseList(List<Integer<>() list){
Collectios.reserse(list);
return list;
}

* Remove duplicates

public static List<Integer> removeDuplicate(List<Integer>() numbers){
return new ArrayList<>(new HasSet<>(numbers));


* Rotate list by k

public class RotateList {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
int k = 2;

        Collections.rotate(list, k);

        System.out.println(list);
    }
}
----------or:
import java.util.*;

public class RotateListManual {

    public static void rotate(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;

        List<Integer> temp = new ArrayList<>();

        temp.addAll(list.subList(n - k, n));
        temp.addAll(list.subList(0, n - k));

        for(int i=0;i<n;i++){
            list.set(i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        rotate(list,2);

        System.out.println(list);
    }
}
* Find second largest number
  import java.util.*;

public class SecondLargest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,4,45,99));

        Collections.sort(list);

        int secondLargest = list.get(list.size()-2);

        System.out.println("Second Largest: " + secondLargest);
    }
}
---------or:
import java.util.*;

public class SecondLargestBetter {

    public static int findSecondLargest(List<Integer> list){

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : list){

            if(num > largest){
                second = largest;
                largest = num;
            }
            else if(num > second && num != largest){
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,4,45,99);

        System.out.println(findSecondLargest(list));
    }
}

* Two-sum problem
  import java.util.*;

public class TwoSum {

    public static int[] twoSum(List<Integer> nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.size();i++){

            int complement = target - nums.get(i);

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums.get(i), i);
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(2,7,11,15);

        int target = 9;

        int[] result = twoSum(nums,target);

        System.out.println(result[0] + " " + result[1]);
    }
}
---

### Summary

ArrayList = **ordered, resizable, fast reads, slower middle inserts/removals**.

Mastering when to use it vs LinkedList is key.

```
```
