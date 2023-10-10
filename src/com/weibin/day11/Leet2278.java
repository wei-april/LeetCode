package com.weibin.day11;

/**
 * @author april
 * @date 2023-10-10
 * @description
 */
public class Leet2278 {

    public static void main(String[] args) {
        System.out.println(200/6);
    }

    public int percentageLetter(String s, char letter) {
        int a = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == letter) {
                a++;
            }
        }
        return a * 100 / l;
    }
}
