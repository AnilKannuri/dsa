package dsa.arrays;

public class Q9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }


    /*
     * Problem: 9. Palindrome Number
     *
     * Approach:
     * 1. Negative numbers are not palindromes.
     * 2. Store the original number.
     * 3. Reverse the number digit by digit.
     * 4. Compare the reversed number with the original.
     * 5. If both are equal, the number is a palindrome.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
