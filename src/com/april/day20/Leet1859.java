package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet1859 {

    public static void main(String[] args) {

    }

    public String sortSentence(String s) {

        String[] s1 = s.split(" ");
        String[] r = new String[s1.length];
        for (String value : s1) {
            char c = value.charAt(value.length() - 1);
            r[c - 49] = value.substring(0, value.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String s2 : r) {
            sb.append(s2).append(" ");
        }
        return sb.toString().trim();
    }
}
