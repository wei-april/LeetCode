package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-11
 * @description
 */
public class Leet1768 {

    public static void main(String[] args) {
        String w1 = "ab";
        String w2 = "pqrs";
        mergeAlternately(w1, w2);
    }

    public static String mergeAlternately(String word1, String word2) {

        int w1 = word1.length();
        int w2 = word2.length();
        int max = Math.max(w1, w2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
