package dsa.arrays;

import java.util.Arrays;

public class Q1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sum1(nums)));
    }

    /*
     * Pattern: Prefix Sum (Running Sum)
     *
     * Idea:
     * - Each element stores the sum of all previous elements including itself.
     * - Update the current element using:
     *      nums[i] += nums[i - 1]
     * - Modify the array in-place to avoid extra space.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int[] sum1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    static int[] sum(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + temp;
            temp = nums[i];
        }
        return nums;
    }
}
