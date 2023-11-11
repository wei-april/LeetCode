package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-11
 * @description
 */
public class Leet1704 {

    public static void main(String[] args) {
        String a = "book";
        halvesAreAlike(a);
    }

    public static boolean halvesAreAlike(String s) {

        int pn = 0;
        int sn = 0;

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (s.charAt(l) == 'a' ||
                    s.charAt(l) == 'e' ||
                    s.charAt(l) == 'i' ||
                    s.charAt(l) == 'o' ||
                    s.charAt(l) == 'u' ||
                    s.charAt(l) == 'A' ||
                    s.charAt(l) == 'E' ||
                    s.charAt(l) == 'I' ||
                    s.charAt(l) == 'O' ||
                    s.charAt(l) == 'U') {
                pn++;
            }
            if (s.charAt(r) == 'a' ||
                    s.charAt(r) == 'e' ||
                    s.charAt(r) == 'i' ||
                    s.charAt(r) == 'o' ||
                    s.charAt(r) == 'u' ||
                    s.charAt(r) == 'A' ||
                    s.charAt(r) == 'E' ||
                    s.charAt(r) == 'I' ||
                    s.charAt(r) == 'O' ||
                    s.charAt(r) == 'U') {
                sn++;
            }

            l++;
            r--;
        }
        return sn == pn;
    }
}
