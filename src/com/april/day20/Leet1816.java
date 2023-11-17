package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";

        truncateSentence(s, 5);
    }

    public static String truncateSentence(String s, int k) {

        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                j++;
                if (j == k) {
                    return s.substring(0, i);
                }
            }

            if (i == s.length() - 1) {
                return s;
            }
        }

        return "";
    }
}
