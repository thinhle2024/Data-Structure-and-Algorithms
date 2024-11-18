import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    void testBasicSorting() {
        int[] input = { 8, 3, 1, 7, 0, 10, 2 };
        int[] expected = { 0, 1, 2, 3, 7, 8, 10 };

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "The array should be sorted in ascending order.");
    }

    @Test
    void testAlreadySorted() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "An already sorted array should remain unchanged.");
    }

    @Test
    void testReverseSorted() {
        int[] input = { 5, 4, 3, 2, 1 };
        int[] expected = { 1, 2, 3, 4, 5 };

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "A reverse sorted array should be sorted correctly.");
    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = { 4, 2, 2, 8, 4, 1 };
        int[] expected = { 1, 2, 2, 4, 4, 8 };

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "An array with duplicates should be sorted correctly.");
    }

    @Test
    void testSingleElementArray() {
        int[] input = { 1 };
        int[] expected = { 1 };

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "A single element array should remain unchanged.");
    }

    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "An empty array should remain unchanged.");
    }

    @Test
    void testLargeArray() {
        int[] input = { 1000, -500, 0, 200, 99, 50, -1000, 750 };
        int[] expected = { -1000, -500, 0, 50, 99, 200, 750, 1000 };

        QuickSort.sort(input, 0, input.length - 1);

        assertArrayEquals(expected, input, "A large array with mixed values should be sorted correctly.");
    }
}