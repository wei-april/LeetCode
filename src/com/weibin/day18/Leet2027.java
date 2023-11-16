package com.weibin.day18;

/**
 * @author april
 * @date 2023-11-15
 * @description
 */
public class Leet2027 {

    public static void main(String[] args) {
        String s = "XXOX";
        minimumMoves(s);
    }

    public static int minimumMoves(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                r++;
                i+=2;
            }
        }
        return r;
    }
}
