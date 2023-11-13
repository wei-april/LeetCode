package com.weibin.day17;

import java.util.HashMap;
import java.util.Map;

/**
 * @author april
 * @date 2023-11-13
 * @description
 */
public class Leet1478 {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 3, 3, 2};

        sumOfUnique(nums);
    }

    public static int sumOfUnique(int[] nums) {
        int r = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (!map.containsKey(num)) {
                map.put(num, 1);
                r += num;
            } else if (map.containsKey(num) && map.get(num) == 2) {

            } else {
                map.put(num, 2);
                r -= num;
            }
        }

        return r;
    }
}
