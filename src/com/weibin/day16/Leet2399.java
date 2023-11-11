package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-11
 * @description
 */
public class Leet2399 {

    public static void main(String[] args) {
        String a = "zz";
        int[] b = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        checkDistances(a, b);
    }

    public static boolean checkDistances(String s, int[] distance) {
        int[] t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            t[index] = i - t[index];
        }

        for (int i = 0; i <= 25; i++) {
            if (t[i] != 0 && t[i] - 1 != distance[i]) {
                return false;
            }
        }
        return true;
    }
}
