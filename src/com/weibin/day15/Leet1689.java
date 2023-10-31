package com.weibin.day15;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet1689 {

    public static void main(String[] args) {
        System.out.println('1' - 0);
        minPartitions("82734");
    }

    public static int minPartitions(String n) {
        int r = 1;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) - 48 > r) {
                r = n.charAt(i) - 48;
            }
        }
        return r;
    }
}
