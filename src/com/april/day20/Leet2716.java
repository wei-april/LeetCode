package com.april.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet2716 {

    public static void main(String[] args) {

    }

    public int minimizedStringLength(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char aChar : chars) {
            if (!map.containsKey(aChar)) {
                map.put(aChar, 1);
            }
        }
        return map.keySet().size();
    }
}
