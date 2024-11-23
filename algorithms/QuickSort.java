package algorithms;
/*
 * Partitioning an array: Values to the left of a pivot is less than 
 * or equal to the pivot. Values to the right of the pivot is greater
 * than or equal to the pivot. 
 */

public class QuickSort {

    private static void swap(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    /***
     * Partitions an array into two subarrays. All values of one of the
     * subarray <= a pivot. all values of the other subarray >= the pivot.
     * 
     * @param arr  unordered array
     * @param low  index of the first element of a subarray
     * @param high index of the last element of a subarray
     * @return index of the pivot
     */
    private static int partition(int[] arr, int low, int high) {
        int indexPivot = low - 1; // criteria: values <= pivot <= other values

        // rearranges values in a way that maintains the aforementioned criteria.
        while (low < high) { 
            if (arr[low] <= arr[high]) { // arr[high] is the pivot
                swap(arr, ++indexPivot, low);
            }
            low++;
        }

        // moves the pivot to its supposed place (ensuring the above criteria)
        swap(arr, ++indexPivot, high);

        return indexPivot;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            // sorts this layer
            int indexPivot = partition(arr, low, high);

            // sorts sublayers
            sort(arr, low, indexPivot - 1);
            sort(arr, indexPivot + 1, high);

            // performs sorting at each layer => top-down approach
        }
    }

}
