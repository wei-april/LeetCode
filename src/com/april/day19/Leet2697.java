package com.april.day19;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet2697 {

    public static void main(String[] args) {
        String a = "egcfe";
        makeSmallestPalindrome(a);
    }

    public static String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();

        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - i - 1]) {

                char aChar = chars[i];
                char bChar = chars[length - i - 1];

                if (aChar > bChar) {
                    chars[i] = chars[length - i - 1];
                } else {
                    chars[length - i - 1] = chars[i];
                }

            }
        }
        
        return new String(chars);
    }
}
