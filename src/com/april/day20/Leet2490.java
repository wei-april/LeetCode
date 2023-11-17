package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet2490 {

    public static void main(String[] args) {

    }

    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        int length = s.length;
        if (s[0].charAt(0) != s[length - 1].charAt(s[length - 1].length() - 1)) {
            return false;
        }

        for (int i = 1; i < s.length; i++) {
            String s1 = s[i - 1];
            String s2 = s[i];
            if (s1.charAt(s1.length() - 1) != s2.charAt(0)) {
                return false;
            }
        }

        return true;
    }
}
