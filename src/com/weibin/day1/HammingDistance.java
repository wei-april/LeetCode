package com.weibin.day1;

/**
 *  @author Weibin on 2018/7/18.
 *  @version 1.0
 *  
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int result = x^y;
        int count = 0;

        while (result != 0){
            count++;
            result &= result - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
