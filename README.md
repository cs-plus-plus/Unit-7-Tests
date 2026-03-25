# CS++ Java — Unit 7: ArrayList

> **Unit 7** | 100 Points | 8 Autograded Tests

In this assignment you will use `ArrayList` operations to traverse, modify, and filter lists. You may only use five methods: `size()`, `add()`, `get()`, `set()`, and `remove()`. No `contains()`, `removeIf()`, or `Collections` utilities allowed.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### ArrayList Basics

An `ArrayList` is a resizable list (unlike arrays which have a fixed size):

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(10);      // [10]
list.add(20);      // [10, 20]
list.add(30);      // [10, 20, 30]
```

### Allowed Methods (for this assignment)

| Method | What It Does | Example |
|--------|-------------|---------|
| `size()` | Returns the number of elements | `list.size()` → `3` |
| `add(value)` | Adds to the end | `list.add(40)` |
| `get(index)` | Returns element at index | `list.get(0)` → `10` |
| `set(index, value)` | Replaces element at index | `list.set(0, 99)` |
| `remove(index)` | Removes element at index and shifts remaining | `list.remove(0)` |

### Traversing an ArrayList

```java
// Standard for loop
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// For-each loop (read-only)
for (int value : list) {
    System.out.println(value);
}
```

### Removing While Traversing (Backwards)

When removing elements during traversal, loop **backwards** to avoid skipping elements:

```java
for (int i = list.size() - 1; i >= 0; i--) {
    if (list.get(i) == target) {
        list.remove(i);
    }
}
```

Why backwards? When you remove index `i`, elements shift left. If you go forward, the next element moves into position `i` and gets skipped.

### Autoboxing

Java automatically converts between `int` and `Integer`:

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(42);           // int 42 is autoboxed to Integer
int value = list.get(0); // Integer is unboxed to int
```

### Checking for Presence (Without contains())

Since you cannot use `contains()`, loop through and compare:

```java
boolean found = false;
for (int i = 0; i < list.size(); i++) {
    if (list.get(i) == target) {
        found = true;
        break;
    }
}
```

---

## Project Overview

You will implement eight static methods in `Unit7.java`. All methods work with `ArrayList<Integer>`. Remember: you may only use `size()`, `add()`, `get()`, `set()`, and `remove()`.

---

## Methods to Implement

### 1. sumOfElements(ArrayList\<Integer\> list)
Return the sum of all elements.

```java
sumOfElements([1, 2, 3, 4, 5])    // returns 15
sumOfElements([10, -5, 3])         // returns 8
```

### 2. removeAllInstances(ArrayList\<Integer\> list, int elementToRemove)
Remove every occurrence of `elementToRemove` from the list. Modify the list in place.

```java
// list = [1, 2, 3, 2, 4, 2]
removeAllInstances(list, 2)
// list is now [1, 3, 4]
```

### 3. doubleAllElements(ArrayList\<Integer\> list)
Multiply every element in the list by 2. Modify the list in place.

```java
// list = [1, 2, 3]
doubleAllElements(list)
// list is now [2, 4, 6]
```

### 4. addIfNotPresent(ArrayList\<Integer\> list, int newElement)
Add `newElement` to the list only if it is not already in the list. Do not use `contains()` — loop and check manually.

```java
// list = [1, 2, 3]
addIfNotPresent(list, 4)   // list is now [1, 2, 3, 4]
addIfNotPresent(list, 2)   // list stays [1, 2, 3, 4] (2 already exists)
```

### 5. getEvenElements(ArrayList\<Integer\> list)
Return a new `ArrayList<Integer>` containing only the even numbers from the original list.

```java
getEvenElements([1, 2, 3, 4, 5, 6])   // returns [2, 4, 6]
getEvenElements([1, 3, 5])             // returns []
```

### 6. removeElementsDivisibleBy5(ArrayList\<Integer\> list)
Remove all elements that are divisible by 5. Modify the list in place.

```java
// list = [5, 12, 15, 7, 20, 3]
removeElementsDivisibleBy5(list)
// list is now [12, 7, 3]
```

### 7. reverseList(ArrayList\<Integer\> list)
Reverse the order of elements in the list. Modify the list in place. Do not create a new list.

```java
// list = [1, 2, 3, 4, 5]
reverseList(list)
// list is now [5, 4, 3, 2, 1]
```

### 8. shuffleList(ArrayList\<Integer\> list)
Randomly rearrange the elements in the list. Modify the list in place. The test checks that the list still contains the same elements (same size, same values) but does not check the specific order.

```java
// list = [1, 2, 3, 4, 5]
shuffleList(list)
// list could be [3, 1, 5, 2, 4] or any other permutation
```

---

## File Structure

```
Unit-7-Tests/
├── pom.xml                                      <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/com/csplusplus/
│   │   └── Unit7.java                           <-- YOUR CODE GOES HERE
│   └── test/java/com/csplusplus/
│       └── Unit7Test.java                       <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                        <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit7.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testSumOfElements | Sums all elements | 10 |
| testRemoveAllInstances | Removes every occurrence of target | 10 |
| testDoubleAllElements | Multiplies all elements by 2 | 10 |
| testAddIfNotPresent | Adds only when not already in list | 10 |
| testGetEvenElements | Returns new list of even numbers only | 10 |
| testRemoveElementsDivisibleBy5 | Removes multiples of 5 | 15 |
| testReverseList | Reverses in place | 15 |
| testShuffleList | Same elements in any order | 20 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — ArrayList basics:**
```java
// Practice.java
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);          // [10, 20, 30]
        System.out.println("Size: " + list.size());    // 3
        System.out.println("First: " + list.get(0));   // 10

        list.set(1, 25);
        System.out.println("After set: " + list);      // [10, 25, 30]

        list.remove(0);
        System.out.println("After remove: " + list);   // [25, 30]
    }
}
```

**Example 2 — Removing while traversing (backwards):**
```java
// Practice.java
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); list.add(12); list.add(15); list.add(7); list.add(20);
        System.out.println("Before: " + list);  // [5, 12, 15, 7, 20]

        // Remove multiples of 5 — traverse backwards!
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 5 == 0) {
                list.remove(i);
            }
        }
        System.out.println("After: " + list);   // [12, 7]
    }
}
```

**Example 3 — Reversing in place:**
```java
// Practice.java
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        // Swap from both ends toward the middle
        for (int i = 0; i < list.size() / 2; i++) {
            int j = list.size() - 1 - i;
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        System.out.println("Reversed: " + list);  // [5, 4, 3, 2, 1]
    }
}
```

**Example 4 — Simple shuffle:**
```java
// Practice.java
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        // Fisher-Yates shuffle
        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int)(Math.random() * (i + 1));
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        System.out.println("Shuffled: " + list);
    }
}
```

---

## Tips for Success

1. You may ONLY use `size()`, `add()`, `get()`, `set()`, and `remove()` — no `contains()`, `indexOf()`, `removeIf()`, or `Collections`
2. When removing elements during a loop, traverse **backwards** (`for (int i = list.size() - 1; i >= 0; i--)`)
3. For `reverseList`, swap elements from both ends toward the middle using `get()` and `set()`
4. For `shuffleList`, the Fisher-Yates algorithm works: swap each element with a random earlier position
5. `remove(index)` takes an `int` index, not a value. `list.remove(0)` removes the first element, not the value `0`
6. Modifying a list during a for-each loop causes `ConcurrentModificationException` — use a standard `for` loop

---

## FAQ

**Q: Why can't I use `contains()`?**
This assignment tests your ability to implement search logic manually. The restriction forces you to write a loop that checks each element.

**Q: Why traverse backwards when removing?**
When you remove element at index `i`, all elements after it shift left by one. If you traverse forward, the element that moved into position `i` gets skipped. Traversing backward avoids this.

**Q: How does `shuffleList` get tested if the order is random?**
The test checks that the shuffled list has the same `size()` and contains all the same elements. It does not check the specific order.

**Q: What is the difference between `remove(int index)` and removing a value?**
`list.remove(0)` removes the element at index 0. To remove the Integer value `0`, you would need `list.remove(Integer.valueOf(0))` — but since this assignment only uses index-based removal, this should not be an issue.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
