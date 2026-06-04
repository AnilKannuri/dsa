package dsa.arrays;

public class Q27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;
        System.out.println(removeTargetVal(nums, target));
    }

    /*
     * Pattern: Two Pointers (Fast & Slow)
     *
     * Idea:
     * - Use a fast pointer to traverse the array.
     * - Use a slow pointer to track the position where the next valid element
     *   (not equal to val) should be placed.
     * - Whenever a valid element is found, copy it to the slow pointer position
     *   and move slow forward.
     * - Elements equal to val are skipped.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static int removeTargetVal(int[] nums, int target) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != target) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
