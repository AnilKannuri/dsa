package dsa.strings;

import java.util.Arrays;

public class Q344 {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'e', 'l', 'l', 'o'};

        System.out.println(Arrays.toString(reverse(chars)));
    }


    /*
     * LeetCode 344 - Reverse String
     *
     * Pattern: Two Pointers
     *
     * Approach:
     * - Initialize two pointers at the start and end of the array.
     * - Swap the characters at both pointers.
     * - Move the left pointer forward and the right pointer backward.
     * - Continue until all characters are reversed.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static char[] reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left <= right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return chars;
    }
}
