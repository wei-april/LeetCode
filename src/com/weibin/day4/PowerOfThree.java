package com.weibin.day4;

/**
 *  @author Weibin on 2018/8/13.
 *  @version 1.0
 *  
 */
public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(0));
    }


    public static boolean isPowerOfThree(int n) {
        double res = Math.log10(n) / Math.log10(3);

        if ((res - (int)res == 0)){
            return true;
        }else {
            return false;
        }
    }
}
