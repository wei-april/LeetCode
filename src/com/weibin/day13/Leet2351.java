package com.weibin.day13;

/**
 * @author april
 * @date 2023-10-25
 * @description
 */
public class Leet2351 {


    public static void main(String[] args) {
        String s = "abccbaacz";

        repeatedCharacter(s);
    }

    public static char repeatedCharacter(String s) {
        int[] r = new int[26];
        char ch = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int i1 = c - 97;
            if (r[i1] == 1) {
                ch = s.charAt(i);
                break;
            }
            r[i1] = 1;
        }
        return ch;
    }
}
