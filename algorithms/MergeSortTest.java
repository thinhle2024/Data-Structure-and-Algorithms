package algorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MergeSortTest {

    // special cases: empty, increasing, decreasing, with duplicates (non-increasing or non-decreasing), 
    // general cases, with negative numbers, stress test approach

    @Test
    void testEmptyArray() {
        int[] arr = {};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{}, arr, "The array should be empty.");
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {5};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{5}, arr, "An array with a single element should remain the same.");
    }

    @Test
    void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr, "The already sorted array should remain the same.");
    }

    @Test
    void testArrayWithDuplicates() {
        int[] arr = {3, 5, 3, 8, 3, 9, 5};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{3, 3, 3, 5, 5, 8, 9}, arr, "The array with duplicates should be sorted.");
    }

    @Test
    void testReverseSortedArray() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, arr, "The reverse sorted array should be sorted in ascending order.");
    }

    @Test
    void testGeneralUnsortedArray() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, arr, "The general unsorted array should be sorted.");
    }

    @Test
    void testLargeArray() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = 1000 - i; // reverse order
        }
        MergeSort.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i], "The array should be sorted in ascending order.");
        }
    }

    @Test
    void testArrayWithNegativeNumbers() {
        int[] arr = {-3, -1, -2, 0, 1, 2, 3};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1, 2, 3}, arr, "The array with negative numbers should be sorted.");
    }


}