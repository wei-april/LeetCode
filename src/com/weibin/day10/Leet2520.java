package com.weibin.day10;

/**
 * @author april
 * @date 2023-10-09
 * @description
 */
public class Leet2520 {

    public static void main(String[] args) {
        countDigits(1248);
    }

    public static int countDigits(int num) {
        int t = num;
        int r = 0;
        while (num > 0) {
            int i1 = num % 10;
            num = num / 10;
            if (t % i1 == 0) {
                r++;
            }
        }
        return r;
    }
}
