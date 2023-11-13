package com.weibin.day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author april
 * @date 2023-11-13
 * @description
 */
public class Leet2457 {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3,1,2,4};
        unequalTriplets(nums);
    }

    public static int unequalTriplets(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        if (map.keySet().size() >= 3) {
            Collection<Integer> values = map.values();
            ArrayList<Integer> integers = new ArrayList<>(values);
            int r = 0, n = nums.length, t = 0;
            for (Integer integer : integers) {
                r += t * integer * (n - t - integer);
                t += integer;
            }
            return r;
        }

        return res;
    }
}
