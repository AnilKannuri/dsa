package dsa.arrays;

import java.util.Arrays;

public class Q283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        System.out.println(Arrays.toString(moveZerosToRight(nums)));
    }

    /*
     * Pattern: Two Pointers (In-Place Array Modification)
     *
     * Idea:
     * - Use one pointer to track the position where the next non-zero element should be placed.
     * - Traverse the array with another pointer.
     * - When a non-zero element is found, swap it with the element at the target position.
     * - Increment the target position pointer.
     * - After traversal, all non-zero elements are at the beginning and zeros are moved to the end.
     *
     * Why This Works?
     * - Maintains the relative order of non-zero elements.
     * - Performs the operation in-place without using extra space.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int[] moveZerosToRight(int[] nums){
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
        return nums;
    }
}
