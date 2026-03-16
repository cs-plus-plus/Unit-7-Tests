package com.csplusplus;

import java.util.ArrayList;

/**
 * Unit 7: ArrayList operations.
 *
 * <p><b>Important constraint:</b> You may ONLY use these ArrayList methods:
 * size(), add(), get(), set(), remove(). Do NOT use contains(), removeIf(),
 * Collections class, or any other convenience methods.</p>
 */
public class Unit7 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
        // Example: test sumOfElements
        ArrayList<Integer> list = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("sumOfElements([1, 2, 3, 4, 5]) = " + sumOfElements(list));  // Expected: 15
    }

    /**
     * Returns the sum of all elements in the ArrayList.
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>sumOfElements([1, 2, 3, 4, 5]) returns 15</li>
     *   <li>sumOfElements([-1, -2, -3]) returns -6</li>
     * </ul>
     *
     * <p>Hint: Use a loop with get(i) to access each element and add it to a running total.</p>
     *
     * @param list the ArrayList of integers
     * @return the sum of all elements
     */
    public static int sumOfElements(ArrayList<Integer> list) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Removes all occurrences of the specified value from the ArrayList.
     *
     * <p>Points: 10</p>
     *
     * <p>Example: removeAllInstances([1, 2, 3, 2, 4, 2], 2) modifies list to [1, 3, 4]</p>
     *
     * <p>Hint: Loop backwards through the list to avoid skipping elements
     * when you remove. Use get(i) to check and remove(i) to remove.</p>
     *
     * @param list the ArrayList to modify
     * @param elementToRemove the value to remove
     */
    public static void removeAllInstances(ArrayList<Integer> list, int elementToRemove) {
        // TODO: Implement this method
    }

    /**
     * Multiplies each element in the ArrayList by 2.
     *
     * <p>Points: 10</p>
     *
     * <p>Example: doubleAllElements([1, 2, 3]) modifies list to [2, 4, 6]</p>
     *
     * <p>Hint: Use set(i, newValue) to update each element in place.</p>
     *
     * @param list the ArrayList to modify
     */
    public static void doubleAllElements(ArrayList<Integer> list) {
        // TODO: Implement this method
    }

    /**
     * Adds an element to the list only if it is not already present.
     * You must check manually with a loop — do NOT use contains().
     *
     * <p>Points: 10</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>addIfNotPresent([1, 2, 3], 4) modifies list to [1, 2, 3, 4]</li>
     *   <li>addIfNotPresent([1, 2, 3], 2) leaves list unchanged</li>
     * </ul>
     *
     * <p>Hint: Loop through checking if any element equals the value.
     * If not found after the loop, add it.</p>
     *
     * @param list the ArrayList to potentially add to
     * @param newElement the element to add if not present
     */
    public static void addIfNotPresent(ArrayList<Integer> list, int newElement) {
        // TODO: Implement this method
    }

    /**
     * Returns a new ArrayList containing only the even numbers from the input list.
     *
     * <p>Points: 10</p>
     *
     * <p>Example: getEvenElements([1, 2, 3, 4, 5, 6]) returns [2, 4, 6]</p>
     *
     * <p>Hint: Create a new ArrayList. Loop through the original, and if
     * element % 2 == 0, add it to the new list.</p>
     *
     * @param list the original ArrayList
     * @return a new ArrayList containing only even numbers
     */
    public static ArrayList<Integer> getEvenElements(ArrayList<Integer> list) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Removes all elements divisible by 5 from the ArrayList.
     *
     * <p>Points: 15</p>
     *
     * <p>Example: removeElementsDivisibleBy5([5, 10, 3, 20, 7]) modifies list to [3, 7]</p>
     *
     * <p>Hint: Loop backwards to avoid index issues when removing.
     * Check if element % 5 == 0.</p>
     *
     * @param list the ArrayList to modify
     */
    public static void removeElementsDivisibleBy5(ArrayList<Integer> list) {
        // TODO: Implement this method
    }

    /**
     * Reverses the order of elements in the ArrayList in place.
     *
     * <p>Points: 15</p>
     *
     * <p>Example: reverseList([1, 2, 3, 4, 5]) modifies list to [5, 4, 3, 2, 1]</p>
     *
     * <p>Hint: Swap elements from both ends moving inward. Use get() and set()
     * to swap elements at positions i and (size - 1 - i).</p>
     *
     * @param list the ArrayList to reverse
     */
    public static void reverseList(ArrayList<Integer> list) {
        // TODO: Implement this method
    }

    /**
     * Shuffles the elements of the ArrayList randomly.
     * All original elements must still be present after shuffling.
     *
     * <p>Points: 20</p>
     *
     * <p>Hint: Use the Fisher-Yates shuffle: loop from the last element
     * to the first, swapping each with a randomly chosen element at an
     * equal or lower index. Use (int)(Math.random() * (i + 1)) for the random index.</p>
     *
     * @param list the ArrayList to shuffle
     */
    public static void shuffleList(ArrayList<Integer> list) {
        // TODO: Implement this method
    }
}
