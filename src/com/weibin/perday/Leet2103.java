package com.weibin.perday;

import java.util.*;

/**
 * @author april
 * @date 2023-11-02
 * @description
 */
public class Leet2103 {

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";

        countPoints(rings);
    }

    public static int countPoints(String rings) {
        if (rings.length() < 6) {
            return 0;
        }
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 1; i < rings.length(); i+=2) {
            char c = rings.charAt(i - 1);
            if (!map.containsKey(rings.charAt(i))) {
                Set<Character> t = new HashSet<>();
                t.add(c);
                map.put(rings.charAt(i), t);
            } else {
                Set<Character> strings = map.get(rings.charAt(i));
                strings.add(c);
                map.put(rings.charAt(i), strings);
            }
        }
        int r = 0;
        List<Set<Character>> list = new ArrayList<>(map.values());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() == 3) {
                r++;
            }
        }
        return r;
    }
}
