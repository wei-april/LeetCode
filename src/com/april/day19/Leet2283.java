package com.april.day19;

import java.util.HashMap;
import java.util.Map;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet2283 {

    public static void main(String[] args) {
        String a = "1210";
        digitCount(a);
    }

    public static boolean digitCount(String num) {

        char[] chars = num.toCharArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            map.merge(aChar - 48, 1, Integer::sum);
        }
        for (int i = 0; i < chars.length; i++) {
            Integer integer = map.get(i);
            if (integer == null) {
                integer = 0;
            }
            if (integer != chars[i] - 48) {
                return false;
            }
        }

        return true;
    }
}
