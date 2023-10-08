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
        int i = Arrays.stream(nums).max().getAsInt();
        int i1 = ((k - 1) * k) / 2;
        return i * k + i1;
    }
}
