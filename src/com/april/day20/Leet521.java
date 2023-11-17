package com.april.day20;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet521 {

    public static void main(String[] args) {

    }

    public int findLUSlength(String a, String b) {

        if (a.equals(b)) {
            return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}
