package com.weibin.day6;

import java.util.List;

/**
 * @author april
 * @date 2023-09-20
 * @description
 */
public class Leet2828 {

    public static void main(String[] args) {

    }

    public boolean isAcronym(List<String> words, String s) {


        if (words.size() != s.length()) {
            return false;
        }

        boolean r = true;
        for (int i = 0; i < words.size(); i++) {
            String s1 = words.get(i);
            if (s1.charAt(0) != s.charAt(i)) {
                r = false;
                break;
            }
        }
        return r;
    }
}
