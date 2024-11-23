package algorithms;
/*
 * Values to the left of a pivot is less than or equal to the pivot. 
 * Values to the right of the pivot is more than or equal to the pivot. 
 * Keep partition the array in that manner until all values are sorted. 
 * That is the gist of quick sort. Merge sort uses bottom-up approach, 
 * whereas quick sort uses top-down approach.
 */

public class QuickSort {

    private static void swap(int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    /***
     * Partitions an array into two subarrays. Values of the left
     * subarray <= a pivot. Values of the right subarray >= the pivot.
     * 
     * @param arr  unordered array
     * @param low  index of the first element of a subarray
     * @param high index of the last element of a subarray
     * @return index of the pivot
     */
    private static int partition(int[] arr, int low, int high) {
        int indexPivot = low - 1; // presume pivot <= all values

        // rearranges values in a way that maintains the forementioned criteria.
        while (low < high) { // "< high" ~ not having to use an extra
                             // variable (in-place algorithm principle)
            if (arr[low] <= arr[high]) {
                indexPivot++;
                swap(arr, indexPivot, low);
            }

            low++;
        }

        swap(arr, ++indexPivot, high);

        return indexPivot;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {

            // sorts this layer
            int indexPivot = partition(arr, low, high);

            // sorts sub layers
            sort(arr, low, indexPivot - 1);
            sort(arr, indexPivot + 1, high);
        }
    }

}
