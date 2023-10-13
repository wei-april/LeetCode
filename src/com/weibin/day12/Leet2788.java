package com.weibin.day12;

/**
 * @author april
 * @date 2023-10-11
 * @description
 */
public class Leet2788 {


    public static void main(String[] args) {

    }

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n % (i + 1) == 0) {
                r += nums[i] * nums[i];
            }
        }
        return r;
    }
}
