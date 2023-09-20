package com.weibin.day6;

/**
 * @author april
 * @date 2023-09-19
 * @description
 */
public class Leet2315 {

    public static void main(String[] args) {
        countAsterisks("l|*e*et|c**o|*de|");
    }

    public static Integer countAsterisks(String s) {
        int as = 0;
        boolean hasS = false;
        for (int i = 0; i < s.length(); i++) {
            if ('|' == s.charAt(i)) {
                hasS = !hasS;
            } else if ('*' == s.charAt(i) && !hasS) {
                as++;
            }
        }
        return as;
    }
}
