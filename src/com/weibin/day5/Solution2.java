package com.weibin.day5;

/**
 *  @author Weibin on 2018/8/20.
 *  @version 1.0
 *  
 */
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n > 0) {
            return (n & n - 1) == 0;
        }else {
            return false;
        }
    }
}
