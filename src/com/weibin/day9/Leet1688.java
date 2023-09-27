package com.weibin.day9;

/**
 * @author april
 * @date 2023-09-27
 * @description
 */
public class Leet1688 {
    public static void main(String[] args) {
        numberOfMatches(14);
    }


    public static int numberOfMatches(int n) {
        int t = 0;
        while (n >  1) {
            int i = n / 2;
            int i1 = n % 2;
            t += i;
            n = i + i1;
        }
        return t;
    }
}
