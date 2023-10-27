package com.weibin.day14;

/**
 * @author april
 * @date 2023-10-27
 * @description
 */
public class Leet242 {

    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }

    public static boolean isAnagram(String s, String t) {
        boolean r = true;
        if (s.length() != t.length()) {
            return false;
        }

        int[] sr = new int[26];
        int[] tr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int i1 = s.charAt(i) - 'a';
            int i2 = t.charAt(i) - 'a';
            sr[i1] = sr[i1] + 1;
            tr[i2] = tr[i2] + 1;
        }

        for (int i = 0; i < sr.length; i++) {
            if (sr[i] != tr[i]) {
                r = false;
                break;
            }
        }

        return r;
    }
}
