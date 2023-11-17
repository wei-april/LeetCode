package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet2000 {

    public static void main(String[] args) {

    }

    public String reversePrefix(String word, char ch) {

        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (char aChar : chars) {
            sb.append(aChar);
            if (aChar == ch && flag) {
                sb.reverse();
                flag = false;
            }
        }

        return sb.toString();
    }
}
