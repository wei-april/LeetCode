package com.weibin.day11;

/**
 * @author april
 * @date 2023-10-10
 * @description
 */
public class Leet2427 {

    public static void main(String[] args) {
        System.out.println(commonFactors(25, 30));
    }

    public static int commonFactors(int a, int b) {
        int max = a > b ? a : b;
        int r = 0;
        for (int i = 1; i <= a ; i++) {
            if (a % i == 0 && b % i == 0) {
                r++;
            }
        }
        return r;
    }
}
