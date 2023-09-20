package com.weibin.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author april
 * @date 2023-09-20
 * @description
 */
public class Leet2325 {

    public static void main(String[] args) {

        //97
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        char[] base = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            if (' ' != key.charAt(i) && sb.indexOf("" + key.charAt(i)) < 0) {
                sb.append(key.charAt(i));
            }
        }
        String s = sb.toString();
        String de = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                de += c;
            } else {
                int i1 = s.indexOf(c);
                de += base[i1];
            }
        }
        return de;
    }
}
