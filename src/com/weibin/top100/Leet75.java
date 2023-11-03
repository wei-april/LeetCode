package com.weibin.top100;

/**
 * @author april
 * @date 2023-11-03
 * @description
 */
public class Leet75 {

    public static void main(String[] args) {
        int[] a = new int[] {2,0,2,1,1,0};
        sortColors(a);
    }

    public static void sortColors(int[] nums) {

        int num0 = 0;
        int num1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                num0++;
            }
            if (nums[i] == 1) {
                num1++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < num0) {
                nums[i] = 0;
            } else if (i < num1 + num0) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }

        System.out.println(111111111);
    }
}
