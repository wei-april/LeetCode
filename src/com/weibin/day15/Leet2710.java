package com.weibin.day15;

/**
 * @author april
 * @date 2023-10-30
 * @description
 */
public class Leet2710 {

    public static void main(String[] args) {
        System.out.println('0');

        System.out.println(removeTrailingZeros("51230100"));
    }

    public static String removeTrailingZeros(String num) {

        String r = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                r = num.substring(0, i + 1);
                break;
            }
        }
        return r;
    }
}
