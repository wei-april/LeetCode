package com.weibin.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author april
 * @date 2023-11-07
 * @description
 */
public class Leet2506 {

    public static void main(String[] args) {
        String[] w = new String[]{"aba","aabb","abcd","bac","aabc"};
        similarPairs(w);
    }

    public static int similarPairs(String[] words) {

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder();
            for (char aChar : chars) {
                if (sb.indexOf(String.valueOf(aChar)) == -1) {
                    sb.append(aChar);
                }
            }

            if (map.containsKey(sb.toString())) {
                map.put(sb.toString(), map.get(sb.toString()) + 1);
            } else {
                map.put(sb.toString(), 1);
            }
        }

        int r = 0;

        ArrayList<Integer> integers = new ArrayList<>(map.values());
        for (Integer integer: integers) {
            if (integer == 2) {
                r += 1;
            }

            if (integer > 2) {
                int i = integer * (integer - 1) / 2;
                r += i;
            }
        }
        return r;
    }
}
