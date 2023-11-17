package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet1047 {

    public static void main(String[] args) {
        String s = "aaaaaaa";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        int i = 0;
        int j = 1;
        StringBuilder sb = new StringBuilder(s);
        while (j < sb.length()) {
            if (sb.charAt(i) == sb.charAt(j)) {
                sb.delete(i, j + 1);
                i = 0;
                j = 1;
            } else {
                i++;
                j++;
            }
        }

        return sb.toString();
    }
}
