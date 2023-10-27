package com.weibin.day14;

/**
 * @author april
 * @date 2023-10-26
 * @description
 */
public class Leet58 {

    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");

        System.out.println("   fly me   to   the moon  ".trim());
    }

    public static int lengthOfLastWord(String s) {
        String trim = s.trim();
        int r = 0;
        for (int i = trim.length() - 1; i >= 0 ; i--) {
            if (trim.charAt(i) != ' ') {
                r++;
            } else {
                break;
            }
        }
        return r;
    }
}
