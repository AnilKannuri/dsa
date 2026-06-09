package dsa.arrays;

import java.util.Arrays;

public class Q977 {
    public static void main(String[] args) {
        int[] nums = {4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(squareOfArray(nums)));
    }

    /*
     * LeetCode 977 - Squares of a Sorted Array
     *
     * Pattern: Two Pointers
     *
     * Approach:
     * - The largest square will always come from either
     *   the leftmost or rightmost element.
     * - Compare squares from both ends.
     * - Place the larger square at the end of the result array.
     * - Move the corresponding pointer inward.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    static int[] squareOfArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] results = new int[nums.length];

        int index = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                results[index] = leftSquare;
                left++;
            } else {
                results[index] = rightSquare;
                right--;
            }

            index--;
        }

        return results;

    }

}
