package com.weibin.day15;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet1967 {

    public static void main(String[] args) {

    }

    public int numOfStrings(String[] patterns, String word) {
        int r = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                r++;
            }
        }
        return r;
    }
}
