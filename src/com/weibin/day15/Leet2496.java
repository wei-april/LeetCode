package com.weibin.day15;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet2496 {

    public static void main(String[] args) {

        System.out.println(Integer.parseInt("00123"));
    }

    public int maximumValue(String[] strs) {
        int r = 0;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            boolean matches = str.matches("^[0-9]*$");
            int t = str.length();
            if (matches) {
                t = Integer.parseInt(str);
            }
            if (t > r) {
                r = t;
            }
        }

        return r;
    }
}
