package com.weibin.day10;

/**
 * @author april
 * @date 2023-10-09
 * @description
 */
public class Leet2678 {

    public static void main(String[] args) {
        System.out.println("7868190130M7522".substring(11, 13));
    }

    public int countSeniors(String[] details) {
        int r = 0;
        for (int i = 0; i < details.length; i++) {
            String s = details[i].substring(11, 13);
            if (Integer.parseInt(s) >= 60) {
                r++;
            }
        }
        return r;
    }
}
