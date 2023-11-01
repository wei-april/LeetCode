package com.weibin.top100;

import java.util.*;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet49 {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> r = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> strings;
            if (map.containsKey(s)) {
                strings = map.get(s);
                strings.add(strs[i]);
            } else {
                strings = new ArrayList<>();
                strings.add(strs[i]);
            }
            map.put(s, strings);
        }
        return new ArrayList<>(map.values());
    }
}
