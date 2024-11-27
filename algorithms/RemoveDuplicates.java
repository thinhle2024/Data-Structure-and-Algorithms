package algorithms;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) { // given nums.length >= 1
        if (nums.length == 1) return 1;

        int leftPointer = 0; // next unique element inserted at this index 
        int rightPointer = 1; // find the next unique element

        while (rightPointer < nums.length) {

            if (nums[leftPointer] == nums[rightPointer]) {
                rightPointer++; // skips all repeating elements
            } else {
                nums[++leftPointer] = nums[rightPointer++]; // moves the unique element to its right spot
            }

        }

        return leftPointer + 1;
    }

}