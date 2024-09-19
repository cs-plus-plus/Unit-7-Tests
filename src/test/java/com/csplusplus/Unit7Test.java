package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class Unit7Test {

    // 1. Test for sumOfElements (10 points)
    @Test
    public void testSumOfElements() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -2, -3, -4));

        assertEquals(15, Unit7.sumOfElements(list1));  // 1+2+3+4+5 = 15
        assertEquals(60, Unit7.sumOfElements(list2));  // 10+20+30 = 60
        assertEquals(-10, Unit7.sumOfElements(list3));  // -1+-2+-3+-4 = -10
    }

    // 2. Test for removeAllInstances (10 points)
    @Test
    public void testRemoveAllInstances() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 4, 1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 40, 10));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));

        Unit7.removeAllInstances(list1, 1);  // Remove all instances of 1
        Unit7.removeAllInstances(list2, 10);  // Remove all instances of 10
        Unit7.removeAllInstances(list3, 5);  // Remove all instances of 5

        assertEquals(new ArrayList<>(Arrays.asList(2, 3, 4)), list1);
        assertEquals(new ArrayList<>(Arrays.asList(20, 30, 40)), list2);
        assertEquals(new ArrayList<>(), list3);
    }

    // 3. Test for doubleAllElements (10 points)
    @Test
    public void testDoubleAllElements() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -2, -3));

        Unit7.doubleAllElements(list1);  // Double all elements
        Unit7.doubleAllElements(list2);  // Double all elements
        Unit7.doubleAllElements(list3);  // Double all elements

        assertEquals(new ArrayList<>(Arrays.asList(2, 4, 6)), list1);
        assertEquals(new ArrayList<>(Arrays.asList(20, 40, 60)), list2);
        assertEquals(new ArrayList<>(Arrays.asList(-2, -4, -6)), list3);
    }

    // 4. Test for addIfNotPresent (10 points)
    @Test
    public void testAddIfNotPresent() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -2, -3));

        Unit7.addIfNotPresent(list1, 4);  // Add 4 (not present)
        Unit7.addIfNotPresent(list2, 20);  // Try to add 20 (already present)
        Unit7.addIfNotPresent(list3, -4);  // Add -4 (not present)

        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), list1);
        assertEquals(new ArrayList<>(Arrays.asList(10, 20, 30)), list2);  // No change
        assertEquals(new ArrayList<>(Arrays.asList(-1, -2, -3, -4)), list3);
    }

    // 5. Test for getEvenElements (10 points)
    @Test
    public void testGetEvenElements() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -2, -3, -4));

        ArrayList<Integer> evens1 = Unit7.getEvenElements(list1);  // Get even elements
        ArrayList<Integer> evens2 = Unit7.getEvenElements(list2);  // Get even elements
        ArrayList<Integer> evens3 = Unit7.getEvenElements(list3);  // Get even elements

        assertEquals(new ArrayList<>(Arrays.asList(2, 4)), evens1);
        assertEquals(new ArrayList<>(Arrays.asList(10, 20, 30)), evens2);
        assertEquals(new ArrayList<>(Arrays.asList(-2, -4)), evens3);
    }

    // 6. Test for removeElementsDivisibleBy5 (15 points)
    @Test
    public void testRemoveElementsDivisibleBy5() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 10, 12, 15, 17, 20));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(25, 50, 100, 101, 102));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 15, 25, 35));

        Unit7.removeElementsDivisibleBy5(list1);  // Remove elements divisible by 5
        Unit7.removeElementsDivisibleBy5(list2);  // Remove elements divisible by 5
        Unit7.removeElementsDivisibleBy5(list3);  // Remove elements divisible by 5

        assertEquals(new ArrayList<>(Arrays.asList(12, 17)), list1);
        assertEquals(new ArrayList<>(Arrays.asList(101, 102)), list2);
        assertEquals(new ArrayList<>(), list3);  // All elements removed
    }

    // 7. Test for reverseList (15 points)
    @Test
    public void testReverseList() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -2, -3));

        Unit7.reverseList(list1);  // Reverse the list
        Unit7.reverseList(list2);  // Reverse the list
        Unit7.reverseList(list3);  // Reverse the list

        assertEquals(new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1)), list1);
        assertEquals(new ArrayList<>(Arrays.asList(30, 20, 10)), list2);
        assertEquals(new ArrayList<>(Arrays.asList(-3, -2, -1)), list3);
    }

    // 8. Test for shuffleList (20 points)
    @Test
    public void testShuffleList() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));

        ArrayList<Integer> originalList1 = new ArrayList<>(list1);
        ArrayList<Integer> originalList2 = new ArrayList<>(list2);
        ArrayList<Integer> originalList3 = new ArrayList<>(list3);

        Unit7.shuffleList(list1);  // Shuffle the list
        Unit7.shuffleList(list2);  // Shuffle the list
        Unit7.shuffleList(list3);  // Shuffle the list

        // Verify that the lists have been shuffled and are different from their original order
        assertNotEquals(originalList1, list1);
        assertNotEquals(originalList2, list2);
        assertNotEquals(originalList3, list3);

        // Verify the shuffled lists still contain the same elements
        assertTrue(list1.containsAll(originalList1) && originalList1.containsAll(list1));
        assertTrue(list2.containsAll(originalList2) && originalList2.containsAll(list2));
        assertTrue(list3.containsAll(originalList3) && originalList3.containsAll(list3));
    }
}
