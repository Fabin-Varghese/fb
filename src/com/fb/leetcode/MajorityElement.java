package com.fb.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 * 
 */

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int k = majorityElement(nums);
        System.out.println("k:"+k);

    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int majority = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            if (map.containsKey(current)) {
                int val = map.get(current) + 1;
                if (val > majority) {
                    return current;
                } else {
                    map.put(current, val);
                }

            } else {
                map.put(current, 1);
            }

        }

        return nums[0];
    }
}
