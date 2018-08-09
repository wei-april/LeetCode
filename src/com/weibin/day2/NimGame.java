package com.weibin.day2;

/**
 *  @author Weibin on 2018/7/19.
 *  @version 1.0
 *  
 */
public class NimGame {

    public static boolean canWinNim(int n) {
        if(n%4 >=1 && n%4 <=3){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canWinNim(5));
    }
}
