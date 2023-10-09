package com.weibin.day10;

/**
 * @author april
 * @date 2023-10-09
 * @description
 */
public class Leet1827 {

    public static void main(String[] args) {
        int[] a = {1,5,2,4,1};
        System.out.println(minOperations(a));
    }

    public static int minOperations(int[] nums) {

        if (nums.length < 1) {
            return 0;
        }
        int r = 0;
        for (int i = 1; i < nums.length; i++) {
            int pre = nums[i - 1];
            int curr = nums[i];
            if (curr <= pre) {
                int i1 = pre - curr + 1;
                r += i1;
                nums[i] = pre + 1;
            }
        }
        return r;
    }
}
