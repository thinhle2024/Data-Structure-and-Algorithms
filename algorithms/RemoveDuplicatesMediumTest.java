package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesMediumTest {

    @Test
    void testRemoveDuplicatesMedium1Element() {
        int[] expected = { 0 };
        int[] actual = { 0 };

        int expectedLength = 1;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium2Element1() {
        int[] expected = { 0, 0 };
        int[] actual = { 0, 0 };

        int expectedLength = 2;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium2Element2() {
        int[] expected = { 0, 1 };
        int[] actual = { 0, 1 };

        int expectedLength = 2;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium3Element1() {
        int[] expected = { 0, 0, 0 };
        int[] actual = { 0, 0, 0 };

        int expectedLength = 2;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium3Element2() {
        int[] expected = { 0, 0, 1 };
        int[] actual = { 0, 0, 1 };

        int expectedLength = 3;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium3Element3() {
        int[] expected = { 0, 1, 1 };
        int[] actual = { 0, 1, 1 };

        int expectedLength = 3;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium3Element4() {
        int[] expected = { 0, 1, 2 };
        int[] actual = { 0, 1, 2 };

        int expectedLength = 3;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium4Element1() {
        int[] expected = { 0, 0, 0, 0 };
        int[] actual = { 0, 0, 0, 0 };

        int expectedLength = 2;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium4Element2() {
        int[] expected = { 0, 0, 1, 1 };
        int[] actual = { 0, 0, 0, 1 };

        int expectedLength = 3;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium4Element3() {
        int[] expected = { 0, 0, 1, 1 };
        int[] actual = { 0, 0, 1, 1 };

        int expectedLength = 4;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium4Element4() {
        int[] expected = { 0, 1, 1, 1 };
        int[] actual = { 0, 1, 1, 1 };

        int expectedLength = 3;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium4Element5() {
        int[] expected = { 0, 1, 1, 2 };
        int[] actual = { 0, 1, 1, 2 };

        int expectedLength = 4;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMedium4Element6() {
        int[] expected = { 0, 1, 2, 2 };
        int[] actual = { 0, 1, 2, 2 };

        int expectedLength = 4;
        int actualLength = RemoveDuplicatesMedium.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }
}
