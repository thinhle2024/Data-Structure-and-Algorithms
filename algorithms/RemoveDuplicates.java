package algorithms;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) { // given nums.length >= 1
        if (nums.length == 1) return 1;

        // int[] expected =    { 0, 1, 2, 3, 4, 2, 2, 3, 3, 4 };
        // int[] actual =      { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int insertable = 1;

        for (int read = 1; read < nums.length; read++) {
            if (nums[insertable - 1] != nums[read]) {
                nums[insertable++] = nums[read];
            }
        }

        return insertable;
    }

}