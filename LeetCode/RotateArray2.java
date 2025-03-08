package LeetCode;

import java.util.Arrays;

public class RotateArray2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3); 
    }

    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums,0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums,k,n-1);
       System.out.print(Arrays.toString(nums));

    }

    private static void reverse(int[] nums, int left, int right) {

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    
}
