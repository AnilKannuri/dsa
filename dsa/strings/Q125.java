package dsa.strings;

public class Q125 {
    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindromeOrNot(name));
    }


    /*
     * LeetCode 125 - Valid Palindrome
     *
     * Pattern: Two Pointers
     *
     * Approach:
     * - Use two pointers from both ends of the string.
     * - Skip non-alphanumeric characters.
     * - Compare characters in lowercase.
     * - If any pair differs, return false.
     * - If all pairs match, return true.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static boolean checkPalindromeOrNot(String s) {
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
