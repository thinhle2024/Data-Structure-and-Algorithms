package algorithms;

import java.util.Arrays;

public class MergeSort {
    private static void merge(int[] arr, int[] left, int[] right) {
        int l = 0, r = 0; // left[l++] and right[r++]
        int a = 0; // arr[a++]

        // merge array left and array right into array arr
        while (l < left.length && r < right.length) { // bound checking
            // merges the smaller value between left[l] and right[r] into arr
            if (left[l] <= right[r]) {
                arr[a++] = left[l++];
            } else {
                arr[a++] = right[r++];
            }
        }

        // merge the remaining of array left if any
        while (l < left.length) { // bound checking
            arr[a++] = left[l++];
        }

        // merge the remaining of array right if any
        while (r < right.length) { // bound checking
            arr[a++] = right[r++];
        }
    }

    private static void divide(int[] arr) {
        if (arr.length < 2)
            return;

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid); // [0, mid - 1]
        int[] right = Arrays.copyOfRange(arr, mid, arr.length); // [mid, len - 1]

        // gets to the leaf nodes of the tree before
        divide(left);
        divide(right);

        // performs sorting
        merge(arr, left, right);

        // => bottom-up approach
    }

    public static void sort(int[] arr) {
        divide(arr);
    }
}
