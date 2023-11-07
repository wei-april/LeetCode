package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-07
 * @description
 */
public class Leet2108 {

    public static void main(String[] args) {
        String[] a = new String[]{"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(a));
    }
    public static String firstPalindrome(String[] words) {

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            if (sb.toString().equals(word)) {
                return word;
            }
        }

        return "";
    }
}
