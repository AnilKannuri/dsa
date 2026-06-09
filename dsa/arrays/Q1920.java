package dsa.arrays;

import java.util.Arrays;

public class Q1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArrayFromPermutations(nums)));
    }

    /*
     * LeetCode 1920 - Build Array from Permutation
     *
     * Pattern: Array Index Mapping
     *
     * Approach:
     * - For each index i, use nums[i] as a new index.
     * - Store nums[nums[i]] in the answer array.
     * - Build the result by following the permutation mapping.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    static int[] buildArrayFromPermutations(int[] nums){
        int[] results = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            results[i] = nums[nums[i]];
        }
        return results;
    }
}
