package com.weibin.top100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author april
 * @date 2023-11-03
 * @description
 */
public class Leet287 {

    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean add = set.add(nums[i]);
            if (!add) {
                return nums[i];
            }
        }
        return 1;
    }

    public static int findDuplicate1(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (i == nums[i]) {
                i++;
                continue;
            }
            int t = nums[nums[i]];
            if (nums[i] == t) {
                return nums[i];
            }
            nums[nums[i]] = nums[i];
            nums[i] = t;
        }
        return 0;
    }
}
