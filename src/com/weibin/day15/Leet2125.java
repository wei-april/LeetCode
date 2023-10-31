package com.weibin.day15;

/**
 * @author april
 * @date 2023-10-30
 * @description
 */
public class Leet2125 {

    public static void main(String[] args) {
        String[] a = new String[] {"011001","000000","010100","001000"};
        numberOfBeams(a);
    }

    public static int numberOfBeams(String[] bank) {
        int r = 0;
        int a = 0;
        for (int i = 0; i < bank.length; i++) {
            int t = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    t++;
                }
            }
            if (t != 0) {
                r += t * a;
                a = t;
            }
        }
        return r;
    }
}
