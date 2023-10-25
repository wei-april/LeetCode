package com.weibin.day13;

/**
 * @author april
 * @date 2023-10-25
 * @description
 */
public class Leet2114 {

    public static void main(String[] args) {

    }

    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            int length = sentences[i].split(" ").length;
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
