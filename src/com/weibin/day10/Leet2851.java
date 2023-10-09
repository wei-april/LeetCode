package com.weibin.day10;

/**
 * @author april
 * @date 2023-10-09
 * @description
 */
public class Leet2851 {

    public static void main(String[] args) {

    }


    public int prefixCount(String[] words, String pref) {
        int r = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                r++;
            }
        }
        return r;
    }
}
