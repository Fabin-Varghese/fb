package com.fb.leetcode;


/**
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class ValidPalindrome {

    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        boolean p = isPalindrome(s);
        System.out.println("Is Palindrome:" + p);
    }

    private static boolean isPalindrome(String s) {
        if (s == null)
            return false;
        int l = s.length();
        int left = 0;
        int right = l - 1;
        while (left < right) {
            if (Character.isLetterOrDigit(s.charAt(left)) && Character.isLetterOrDigit(s.charAt(right))) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;

            }

        }

        return true;

    }

}
