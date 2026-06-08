package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 10, 7, 12, 5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    /*
     * Pattern: Comparison-Based Sorting
     *
     * Bubble Sort repeatedly compares adjacent elements
     * and swaps them if they are in the wrong order.
     * After each pass, the largest unsorted element
     * "bubbles" to its correct position at the end.
     *
     * Time Complexity:
     * - Best Case: O(n)      (already sorted with optimization)
     * - Average Case: O(n²)
     * - Worst Case: O(n²)
     *
     * Space Complexity: O(1)
     * Stable Sort: Yes
     */
    static void bubbleSort(int[] nums) {

        // flag for if array is already sorted
        boolean swapped;

        //run over all elements
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            // run over the elements till sorted (eliminate already sorted one's)
            for (int j = 1; j < nums.length - i; j++) {

                // check current element is less than previous element or not
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }

            }

            if (!swapped) {
                break;
            }
        }
    }
}
