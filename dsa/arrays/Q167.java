package dsa.arrays;

import java.util.Arrays;

public class Q167 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(getTargetIndex(nums, target)));
    }

    /*
     * LeetCode 167 - Two Sum II (Input Array Is Sorted)
     *
     * Pattern: Two Pointers
     *
     * Approach:
     * - Place one pointer at the beginning and another at the end.
     * - Calculate the sum of both elements.
     * - If the sum equals the target, return the 1-based indices.
     * - If the sum is smaller than the target, move the left pointer right.
     * - If the sum is greater than the target, move the right pointer left.
     * - The sorted property allows finding the answer in a single pass.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int[] getTargetIndex(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
