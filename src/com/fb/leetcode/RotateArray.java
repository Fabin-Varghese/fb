package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);

    }

    public static void rotate(int[] nums, int k) {
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            int index = (i + k)%l;
            nums[index] = nums2[i];        
        }

        System.out.println(Arrays.toString(nums));

        }

        
        
    }
    

