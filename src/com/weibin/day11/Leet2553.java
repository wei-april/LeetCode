package com.weibin.day11;

import java.util.Arrays;

/**
 * @author april
 * @date 2023-10-10
 * @description
 */
public class Leet2553 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString("12333".split("")));
    }

    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        int[] a = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            a[i] = sb.charAt(i) - '0';
        }
        return a;
    }
}
