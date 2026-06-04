package dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class Q217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean results = checkDuplicates(nums);
        System.out.println(results);
    }

    private static boolean checkDuplicates(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for(int num : nums){
            if(integerSet.contains(num)){
                return true;
            }
            integerSet.add(num);
        }
        return false;
    }
}
