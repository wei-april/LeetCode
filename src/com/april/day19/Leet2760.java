package com.april.day19;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet2760 {

    public static void main(String[] args) {
        System.out.println(9999999 + 9999);
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int length = nums.length;

        int r = 0;
        int i = 0;
        while (i < length) {
            if (nums[i] % 2 != 0 || nums[i] > threshold) {
                i++;
                continue;
            }

            //3,2,5,4
            int i2 = i;
            i++;
            while (i < length && nums[i] <= threshold && nums[i - 1] % 2 != nums[i] % 2) {
                i++;
            }
            r = Math.max(r, i - i2);
        }

        return r;
    }
}
