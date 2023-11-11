package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-11
 * @description
 */
public class Leet1370 {

    public static void main(String[] args) {
        String a = "aaaabbbbcccc";
        sortString(a);
    }

    public static String sortString(String s) {
        int[] t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            t[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (t[i] > 0) {
                    sb.append((char)(i + 'a'));
                    t[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (t[i] > 0) {
                    sb.append((char)(i + 'a'));
                    t[i]--;
                }
            }
        }
        return sb.toString();
    }
}
