package com.weibin.day17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author april
 * @date 2023-11-13
 * @description
 */
public class Leet2607 {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        distinctDifferenceArray(a);
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] r = new int[nums.length];
        int length = nums.length;
        Set<Integer> s1 = new HashSet<>();
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = length - 1; i >= 0; i--) {
            s1.add(nums[i]);
            m1.put(i, s1.size());
        }

        s1.clear();
        for (int i = 0; i < length - 1; i++) {
            s1.add(nums[i]);
            Integer integer = m1.get(i + 1);
            r[i] = s1.size() - integer;
        }
        s1.add(nums[length - 1]);
        r[length - 1] = s1.size();
        return r;
    }
}
