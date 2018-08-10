package com.weibin.day3;

/**
 *  @author Weibin on 2018/8/10.
 *  @version 1.0
 *  
 */
public class MySqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public  static int mySqrt(int n){
        if (n < 0){
            return -1;
        }

        if (n == 0){
            return 0;
        }

        //牛顿迭代法，直到0
        double last = 0;
        double res = 1;
        while (res != last){
            last = res;
            res = (res + n/res) / 2;
        }

        return (int) res;
    }
}
