package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-07
 * @description
 */
public class Leet2255 {

    public static void main(String[] args) {

    }

    public int countPrefixes(String[] words, String s) {
        int r = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                r++;
            }
        }
        return r;

    }
}
