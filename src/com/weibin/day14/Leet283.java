package com.weibin.day14;

/**
 * @author april
 * @date 2023-10-27
 * @description
 */
public class Leet283 {

    public static void main(String[] args) {

        int[] a = new int[] {0, 0, 0, 3, 12};

        moveZeroes(a);
    }

    public static void moveZeroes(int[] nums) {

        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[t] = nums[i];
                t++;
            }
        }
        for (int i = t; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(1);
    }
}
