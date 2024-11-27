package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates1Element() {
        int[] expected = { 0 };
        int[] actual = { 0 };

        int expectedLength = 1;
        int actualLength = RemoveDuplicates.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicates2Element1() {
        int[] expected = { 0, 0 };
        int[] actual = { 0, 0 };

        int expectedLength = 1;
        int actualLength = RemoveDuplicates.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicates2Element2() {
        int[] expected = { 0, 1 };
        int[] actual = { 0, 1 };

        int expectedLength = 2;
        int actualLength = RemoveDuplicates.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMultipleElements1() {
        int[] expected =    { 0, 1, 2, 3, 4, 2, 2, 3, 3, 4 };
        int[] actual =      { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int expectedLength = 5;
        int actualLength = RemoveDuplicates.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }

    @Test
    void testRemoveDuplicatesMultipleElements2() {
        int[] expected =    { 0, 1, 3, 4, 1, 3, 3, 4};
        int[] actual =      { 0, 0, 1, 1, 1, 3, 3, 4 };

        int expectedLength = 4;
        int actualLength = RemoveDuplicates.removeDuplicates(actual);

        assertEquals(expectedLength, actualLength, "check the length");
        assertArrayEquals(expected, actual, "check the content of the array");
    }
}
