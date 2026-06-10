package dsa.sorting;

import javax.net.ssl.HostnameVerifier;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
     * Pattern: Insertion Sort
     *
     * Approach:
     * - Treat the first element as sorted.
     * - Pick the next element (key).
     * - Shift larger elements to the right.
     * - Insert the key into its correct position.
     * - Repeat until the entire array is sorted.
     *
     * Time Complexity:
     * - Best: O(n)
     * - Average: O(n²)
     * - Worst: O(n²)
     *
     * Space Complexity: O(1)
     * Stable Sort: Yes
     */
    static void insertionSort(int[] nums){

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j > 0 ; j--) {

                if(nums[j] < nums[j - 1]){
                    swap(nums, j, j - 1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int first, int secound){
        int temp = nums[first];
        nums[first] = nums[secound];
        nums[secound] = temp;
    }
}
