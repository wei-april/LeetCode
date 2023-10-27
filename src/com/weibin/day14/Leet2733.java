package com.weibin.day14;

/**
 * @author april
 * @date 2023-10-26
 * @description
 */
public class Leet2733 {

    public static void main(String[] args) {

    }

    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int r = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min && nums[i] != max) {
                r = nums[i];
                break;
            }
        }
        return r;
    }
}
