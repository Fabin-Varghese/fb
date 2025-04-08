package LeetCode;

/**
 * 
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum is greater than or equal to
 * target. If there is no such subarray, return 0 instead.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem
 * constraint.
 * Example 2:
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 104
 * 
 */
public class MinSubArrayLen {
  public static void main(String[] args) {
    int target = 7;
    int[] nums = { 2, 3, 1, 2, 4, 3 };
    System.out.println("k:");
    int k = minSubArrayLen(target, nums);
    System.out.println("k:" + k);
  }

  // The function returns the length of the smallest contiguous subarray of which
  // the sum is at least target.
  // If there is no such subarray, return 0 instead.
  public static int minSubArrayLen(int target, int[] nums) {
    int left = 0;
    int sum = 0;
    int minLength = Integer.MAX_VALUE;

    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];
      while (sum >= target) {
        minLength = Math.min(minLength, right - left + 1);
        sum -= nums[left];
        left++;

      }
    }

    return (minLength == Integer.MAX_VALUE ? 0 : minLength);

  }

}
