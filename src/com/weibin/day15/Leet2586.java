package com.weibin.day15;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet2586 {

    public static void main(String[] args) {

    }

    public int vowelStrings(String[] words, int left, int right) {
        int r = 0;
        for (int i = left; i <= right ; i++) {
            String word = words[i];
            char s = word.charAt(0);
            char e = word.charAt(word.length() - 1);
            if ((s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')
                    && (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u')) {
                r++;
            }
        }
        return r;
    }
}
