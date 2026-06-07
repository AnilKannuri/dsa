package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class Q169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    /*
     * Pattern: Boyer-Moore Voting Algorithm
     *
     * Idea:
     * - The majority element appears more than n/2 times.
     * - Different elements cancel each other out.
     * - Keep a candidate and a count.
     * - If count becomes 0, choose the current element as the new candidate.
     * - Increment count for the same element, decrement for a different element.
     * - The remaining candidate is the majority element.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    static int majorityElement(int[] nums) {

        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = num;
                    count++;
                }
            }
        }
        return candidate;
    }

    static int majorityElementBruteForce(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
