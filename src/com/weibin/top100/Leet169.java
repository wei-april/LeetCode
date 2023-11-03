package com.weibin.top100;

import java.util.Arrays;

/**
 * @author april
 * @date 2023-11-03
 * @description
 */
public class Leet169 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 3};
        majorityElement(a);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int t = nums[0];
        int r = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != t) {
                t = nums[i];
                r = Math.max(i - j, r);
                j = i;
                if (r > nums.length / 2) {
                    return nums[i - 1];
                }
            }
            if (nums[i] == t && i == nums.length - 1) {
                r = Math.max(i - j, r) + 1;
                if (r > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return t;
    }
}
