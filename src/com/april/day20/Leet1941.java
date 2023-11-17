package com.april.day20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author april
 * @date 2023-11-17
 * @description
 */
public class Leet1941 {

    public static void main(String[] args) {

    }

    public boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            map.merge(aChar, 1, Integer::sum);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() < 2;
    }
}
