package algorithms;

public class RemoveDuplicatesMedium {

    public static int removeDuplicates(int[] nums) { // given 1 <= n
        if (nums.length < 3) return nums.length; 

        /*
         * 0
         * 00
         * 01
         * 
         * returns nums.length
         * 
         * 00'0
         * 01'1
         * 01'2
         * 
         * inserts at index 2 regardless of the values of the first two element
         * 
         * 0000 -> 00__
         * 0001 -> 001_
         * 0011 -> 0011
         * 0111 -> 011_
         * 
         * i j k l
         * 0 0 0 0
         * 0 0 0 1
         * 0 0 1 1
         * 0 1 1 1
         * 
         */

        int insertable = 2;

        for (int read = 2; read < nums.length; read++) {
            if (nums[insertable - 2] != nums[read]) {
                nums[insertable++] = nums[read];
            }
        }

        return insertable;
    }
    
}
