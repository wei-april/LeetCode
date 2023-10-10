package com.weibin.day11;

/**
 * @author april
 * @date 2023-10-10
 * @description
 */
public class Leet2485 {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
        int n = 8;
        //纯数学方法  //高斯求和 等差数列求和公式
        int t = (n * n + n) / 2;
        int x = (int) Math.sqrt(t);
        if (x * x == t) {
           // return x;
        }
        //return -1;
    }

    public static int pivotInteger(int n) {
        int r = -1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int ts = 0;
        for (int i = n; i >= 1; i--) {
            ts += i;
            int i1 = sum - ts + i;
            if (ts == i1) {
                r = i;
                break;
            }
        }

        return r;
    }
}
