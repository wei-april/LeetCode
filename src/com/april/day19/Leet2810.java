package com.april.day19;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet2810 {
    public static void main(String[] args) {

    }

    public static String finalString(String s) {

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == 'i') {
                sb.reverse();
            } else {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }
}
