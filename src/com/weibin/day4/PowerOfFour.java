package com.weibin.day4;

/**
 *  @author Weibin on 2018/8/13.
 *  @version 1.0
 *  
 */
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(4));
    }


    public static boolean isPowerOfFour(int num) {
        if (num == 1){
            return true;
        }

        while (num%4 != 0 || num == 0){
            return false;
        }
        return isPowerOfFour(num/4);
    }
}
