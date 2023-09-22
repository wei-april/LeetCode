package com.weibin.day7;

/**
 * @author april
 * @date 2023-09-21
 * @description
 */
public class Leet2574 {

    public static void main(String[] args) {
        int[] t = {10, 4, 8, 3};
        leftRightDifference(t);
    }

    public static int[] leftRightDifference(int[] nums) {

        int[] r = new int[nums.length];
        int sum = 0;
        int pre = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            pre+=nums[i];
            int t = sum - 2 * pre + nums[i];
            r[i] = t >= 0 ? t : -t;
        }

        return r;
    }
}
