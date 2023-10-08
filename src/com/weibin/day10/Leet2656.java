package com.weibin.day10;

import java.util.Arrays;

/**
 * @author april
 * @date 2023-10-08
 * @description
 */
public class Leet2656 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        maximizeSum(a, 3);
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = 0;
        for (int j = 0; j < nums.length; j++) {
            max = max >= nums[j] ? max : nums[j];
        }
        int i1 = ((k - 1) * k) / 2;
        return max * k + i1;
    }
}
