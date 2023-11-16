package com.april.day19;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet1021 {

    public static void main(String[] args) {
        String a = "(()())(())";
        removeOuterParentheses(a);
    }

    public static String removeOuterParentheses(String s) {

        char[] chars = s.toCharArray();

        int p = 0;
        int start = 0;
        int end = 0;
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (p == 0) {
                start = i;
            }
            if ('(' == chars[i]) {
                p++;
            }
            if (')' == chars[i]) {
                p--;
            }
            if (p == 0) {
                end = i;
                r.append(s, start + 1, end);
            }
        }
        return r.toString();
    }
}
