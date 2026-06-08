package dsa.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 1, -1, -100};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Pattern: Selection Sort
     *
     * Selection Sort repeatedly finds the maximum element
     * from the unsorted portion of the array and places it
     * at its correct position in the sorted portion.
     *
     * Time Complexity:
     * - Best Case: O(n²)
     * - Average Case: O(n²)
     * - Worst Case: O(n²)
     *
     * Space Complexity: O(1)
     * Stable Sort: No
     * In-Place: Yes
     */

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }


    }

    static void swap(int[] arr, int firstIndex, int secoundIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secoundIndex];
        arr[secoundIndex] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;

    }
}
