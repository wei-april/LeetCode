package com.weibin.day3;

/**
 *  @author Weibin on 2018/8/10.
 *  @version 1.0
 *  
 */
public class ClimbStairs {

    public static void main(String[] args) {

    }

    public static int climbStairs(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }

        //递归超时
        //return climbStairs( n - 1) + climbStairs(n - 2);
        int[] step = new int[n + 1];
        step[0] = 0;
        step[1] = 1;
        step[2] = 2;

        for (int i = 3; i <= n; i++){
            step[i] = step[i -1] + step[i - 2];
        }

        return step[n];

    }
}


