package com.weibin.day7;

import java.util.*;

/**
 * @author april
 * @date 2023-09-21
 * @description
 */
public class Leet2744 {

    public static void main(String[] args) {
        String[] w = new String[] {"cd","ac","dc","ca","zz"};
        maximumNumberOfStringPairs(w);
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int r = 0;
        HashSet<String> strings = new HashSet<>();
        Collections.addAll(strings, words);
        for (String word : words) {
            if (word.charAt(1) == word.charAt(0)) {
                continue;
            }
            String m = "" + word.charAt(1) + word.charAt(0);
            if (strings.contains(m)) {
                r++;
                strings.remove(m);
                strings.remove(word);
            }
        }
        return r;
    }
}
