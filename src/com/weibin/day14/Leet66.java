package com.weibin.day14;

/**
 * @author april
 * @date 2023-10-26
 * @description
 */
public class Leet66 {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] d1 = new int[digits.length + 1];
        d1[0] = 1;
        return d1;
    }
}
