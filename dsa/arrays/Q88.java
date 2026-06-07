package dsa.arrays;


import java.util.Arrays;

/*
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
public class Q88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        System.out.println(Arrays.toString(mergedArray(nums1, m, nums2, n)));
    }


    /*
     * Pattern: Two Pointers (Reverse Merge)
     *
     * Idea:
     * - nums1 has extra space at the end to accommodate nums2.
     * - Start comparing elements from the end of both arrays.
     * - Place the larger element at the end of nums1.
     * - Move the corresponding pointer backward.
     * - If nums2 still has remaining elements, copy them to nums1.
     *
     * Why from the end?
     * - Prevents overwriting existing elements in nums1.
     *
     * Time Complexity: O(m + n)
     * Space Complexity: O(1)
     */
    static int[] mergedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return nums1;
    }
}
