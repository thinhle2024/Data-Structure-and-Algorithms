package algorithms;

import java.util.HashMap;

public class LongestSubstringNoRepetition {

    /*
        From Chat GPT
        Sliding Window Problem:
        Problem: Find the length of the longest substring without repeating characters.
            Input: "abcabcbb"
            Output: 3 (substring "abc")
        Approach:
            Use a sliding window to track characters within the current substring.
            Expand the window by adding new characters until a repeat is found.
            Shrink the window from the left to remove the repeat and continue.

        NOTES: If alphabetical characters are allowed, longest may solely be 26. Major edge case: 
        (1) abccdegh (the repeating characters are right next to each other), (2) zxcabcdebfgh 
        (the repeating characters are in between starting point and the extending point)
    */

    /**
     * Use Sliding Window to find the length of the longest substring.
     * 
     * Approaches:
     * 1. Use brute-force to find all combinations, e.g. abcc -> [ a, ab, abc, abcc, b, bc, bcc, c, cc ]
     * 2. Use Sliding Window to optimize Big O or reduce execution time. 

     * @param str string of any length
     * @return length of the longest substring
     */
    public static int find(String str) {

        if (0 == str.length()) return 0; // edge case

        final int NON_EXISTING = -1;

        final int bound = str.length();
        
        int longest = 1; // stores the solution

        int startingIndex = 0, extendingIndex = 0; // window[startingIndex, extendingIndex]

        int currentCharacterInStr;
        
        int previousIndex;

        int counter;

        int windowLength;

        // False assumption:
        // HashSet<Character> existingValues = new HashSet<>(256); // assume ascii code is used

        // Revised
        HashMap<Integer, Integer> existingValues = new HashMap<>(); // stores the previous indices of repeating characters 

        do {

            // False assumption:
            // if (false == existingValues.add(currentCharacterInStr = str.charAt(extendingIndex))) { 
            //     if (currentCharacterInStr == str.charAt(startingIndex)) {
            //         // at the starting point and the extending point   
            //         startingIndex++; // slides the starting point to the right by 1 character
            //     } else { 
            //         // consecutive indices
            //         startingIndex = extendingIndex;
            //         existingValues.clear();
            //         existingValues.add(currentCharacterInStr);
            //     }
            // }

            // Revised
            currentCharacterInStr = (int)str.charAt(extendingIndex);
            
            // finds the index of the first occurrence of the repeating characters, e.g. abcdb, previousIndex = 1
            previousIndex = existingValues.getOrDefault(currentCharacterInStr, NON_EXISTING) + 1; // the consecutive index

            // marks all characters before the first occurrence of the repeating characters as NON_EXISTING and, of course,
            // that includes the first occurrence (that's why previousIndex + 1)
            for (counter = startingIndex; counter < previousIndex; counter++) {
                existingValues.put((int)str.charAt(counter), NON_EXISTING);
            }   
            
            // 'zxcabcde'bfgh -> zxcab'cde'bfgh
            // preferably, 'zxcabcde'bfgh -> 'cde'bfgh, convert the str to char[], use 
            // the stack memory to accelerate the running time, function arguments 
            // can help to achive this purpose.
        
            existingValues.put(currentCharacterInStr, extendingIndex);

            // update the starting index when there's sign (slides to the right), counter > startingIndex is the sign
            startingIndex = counter > startingIndex ? previousIndex : startingIndex;

            // checks and sees if the current substring is the longest one and records the finding
            if (longest < (windowLength = extendingIndex - startingIndex + 1)) {
                longest = windowLength;
            }

            // the extending point slides to the right
            extendingIndex++;

        } while (extendingIndex < bound);

        return longest;

        /*
         * Mistake 1: False assumption about the repeating characters. They are not at the starting point
         * and the extending point.
         * 
         * Mistake 2: The repeating characters can be consecutive.
         * 
         * Mistake 3: The repeating characters can be in between the starting point and the extending point.
         */
    }

}
