package dsa;

public class Q11 {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(findMAxArea(heights));

    }

    /*
     * LeetCode 11 - Container With Most Water
     *
     * Pattern: Two Pointers
     *
     * Approach:
     * - Start with pointers at both ends of the array.
     * - Calculate the area using:
     *      width * min(leftHeight, rightHeight)
     * - Update the maximum area.
     * - Move the pointer with the smaller height,
     *   since it limits the water container.
     * - Continue until pointers meet.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int findMAxArea(int[] heights){
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left <= right){
            int width = right - left;
            int length = Math.min(heights[left], heights[right]);

            int area = length * width;
            maxArea = Math.max(maxArea, area);

            if(heights[left] <= heights[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
