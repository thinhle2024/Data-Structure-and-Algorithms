package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class LongestSubstringNoRepetitionTest {
    @Test
    public void testLongestSubstringNoRepetitionEmptyInput() {
        assertEquals(0, LongestSubstringNoRepetition.find(""), "Failed test case for empty input");
    }

    @Test
    public void testLongestSubstringNoRepetitionSingleCharacter() {
        assertEquals(1, LongestSubstringNoRepetition.find("a"), "Failed test case for single character input 'a'");
    }

    @Test
    public void testLongestSubstringNoRepetitionRepeatingDoubleCharacters() {
        assertEquals(2, LongestSubstringNoRepetition.find("ab"), "Failed test case for input 'ab'");
    }

    @Test
    public void testLongestSubstringNoRepetitionRepeatingMultipleCharacters() {
        // 'abc'aedfgh
        // a'bcaedfgh'
        assertEquals(8, LongestSubstringNoRepetition.find("abcaedfgh"), "Failed test case for input 'abcaedfgh'");
    }

    @Test
    public void testLongestSubstringNoRepetitionRepeatingMultipleCharactersTricky() {
        // 'abc'cedfgh
        // abc'cedfgh'
        assertEquals(6, LongestSubstringNoRepetition.find("abccedfgh"), "Failed test case for input 'abccedfgh'");
    }

    @Test
    public void testLongestSubstringNoRepetitionRepeatingMultipleCharactersTricky1() {
        // 'abcde'bfgh
        // ab'cdebfgh'
        assertEquals(7, LongestSubstringNoRepetition.find("abcdebfgh"), "Failed test case for input 'abcdebfgh'");
    }
}
