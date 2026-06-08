package dsa.arrays;

public class Q69 {
    public static void main(String[] args) {
        int x = 4;
        // single line solution
        System.out.println((int) Math.sqrt(x));

        // binary search
        System.out.println(squareRoot(x));
    }

    /*
     * LeetCode 69 - Sqrt(x)
     *
     * Pattern: Binary Search on Answer
     *
     * Approach:
     * - Search for the square root in the range [1, x].
     * - If mid * mid <= x, store mid as a possible answer.
     * - Continue searching on the right for a larger valid value.
     * - If mid * mid > x, search on the left.
     * - Return the last valid answer.
     *
     * Time Complexity: O(log x)
     * Space Complexity: O(1)
     */
    static int squareRoot(int x){

        int left = 1;
        int right = x;
        int ans = 0;

        if(x < 2){
            return x;
        }


        while (left <= right){
            int  mid = left + (right - left) / 2;

            long sq = (long) mid * mid;

            if(sq == x){
                return mid;
            }

            if(sq < x){
                ans = mid;
                left = mid + 1;
            }else {
                right = mid -1;
            }

        }
        return ans;
    }
}

