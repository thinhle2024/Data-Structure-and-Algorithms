package algorithms;

import java.util.Arrays;

public class MergeSort {
    private static void merge(int[] arr, int[] left, int[] right) {
        int l = 0, r = 0; // used for array traversal (left[l++] and right[r++])
        int p = 0; // smaller value between left[l] and right[r] is merged into array arr at pivot p (or arr[p])

        // merge array left and array right into array arr

        while (l < left.length && r < right.length) { // bound checking
            if (left[l] <= right[r]) {
                arr[p++] = left[l++];
            } else {
                arr[p++] = right[r++];
            }
        }

        // merge the remaining of array left if any

        while (l < left.length) { // bound checking
            arr[p++] = left[l++];
        }

        // merge the remaining of array right if any

        while (r < right.length) { // bound checking
            arr[p++] = right[r++];
        }
    }

    private static void divide(int[] arr) {
        if (arr.length < 2)
            return;

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid); // 0 -> mid - 1 (inclusive)
        int[] right = Arrays.copyOfRange(arr, mid, arr.length); // mid -> len - 1 (inclusive)

        divide(left);
        divide(right);

        merge(arr, left, right);
    }

    public static void sort(int[] arr) {
        divide(arr);
    }
}
