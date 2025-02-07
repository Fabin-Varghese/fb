package LeetCode;

import java.util.Arrays;


public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = removeDuplicates(nums);
        System.out.println("k:" + k);

    }

    private static int removeDuplicates(int[] nums) {

        int l = nums.length;

        if (l < 1) {
            return 0;
        }

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index] = nums[i];
                index++;

            }
        }

        System.out.println(Arrays.toString(nums));

        return index;

    }
}
