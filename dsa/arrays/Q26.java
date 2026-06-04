package dsa.arrays;

public class Q26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int results = removeDuplicates(nums);
        System.out.println(results);
    }

    /*
     * Pattern: Two Pointers
     *
     * Idea:
     * - Since the array is sorted, duplicates are adjacent.
     * - Use one pointer (i) to track the last unique element.
     * - Use another pointer (j) to scan the array.
     * - When a new unique element is found, place it next to the previous unique element.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static int removeDuplicates(int[] nums) {
        //Two pointer approach
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
