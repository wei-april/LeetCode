package com.april.day20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet821 {

    public static void main(String[] args) {
        String s = "loveleetcode";
        shortestToChar(s, 'e');
    }

    public static int[] shortestToChar(String s, char c) {
        List<Integer> cl = new ArrayList<>();
        char[] chars = s.toCharArray();
        int[] ret = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                cl.add(i);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                ret[i] = 0;
            } else {
                int min = Integer.MAX_VALUE;
                for (Integer integer : cl) {
                    min = Math.min(min, Math.abs(integer - i));
                }
                ret[i] = min;
            }
        }

        return ret;
    }
}
