package dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(findTarget(nums, target)));
    }

    static int[] findTarget(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int exNum = target - nums[i];

            if(map.containsKey(exNum)){
                return new int[]{map.get(exNum), i};
            }
            map.put(nums[i], i);

        }

        return new int[]{-1, -1};
    }

}
