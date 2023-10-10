package com.weibin.day11;

/**
 * @author april
 * @date 2023-10-10
 * @description
 */
public class Leet2864 {

    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("0101"));
    }
    public static String maximumOddBinaryNumber(String s) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                b++;
            }
            if (s.charAt(i) == '0') {
                a++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < b; i++) {
            sb.append("1");
        }
        for (int i = 1; i <= a; i++) {
            sb.append("0");
        }
        return sb.append("1").toString();
    }
}
