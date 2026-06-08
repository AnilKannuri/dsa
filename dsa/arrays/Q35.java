package dsa.arrays;

public class Q35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsertionPosition(nums, target));
    }

    /*
     * LeetCode 35 - Search Insert Position
     *
     * Pattern: Binary Search
     *
     * Approach:
     * - Search for the target using Binary Search.
     * - If found, return its index.
     * - If not found, return the position where it should be inserted.
     * - The 'left' pointer represents the correct insertion position after the search ends.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    static int searchInsertionPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1 ;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        return start;
    }
}
