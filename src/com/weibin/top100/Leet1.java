package com.weibin.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet1 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return r;
    }
}
