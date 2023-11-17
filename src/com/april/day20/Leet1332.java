package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet1332 {

    public static void main(String[] args) {

    }

    public int removePalindromeSub(String s) {

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return 2;
            } else {
                start++;
                end--;
            }
        }
        return 1;
    }
}
