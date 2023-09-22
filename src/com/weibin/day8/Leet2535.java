package com.weibin.day8;

/**
 * @author april
 * @date 2023-09-22
 * @description
 */
public class Leet2535 {

    public static void main(String[] args) {
        System.out.println(15%1000);
    }

    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int s = s(nums[i]);
            sum1+=s;
        }

        return sum > sum1 ? sum - sum1 : sum1 - sum;
    }

    public static int s(int s) {
        int q = s % 10000 / 1000;;
        int b = s % 1000 / 100;;
        int s1 = s % 100 / 10;
        int g = s % 10;
        return q + b + s1 + g;
    }
}
