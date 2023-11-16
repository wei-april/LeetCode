package com.april.day19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet2194 {

    public static void main(String[] args) {
        String s = "A1:F9";
        cellsInRange(s);
    }

    public static List<String> cellsInRange(String s) {
        List<String> ret = new ArrayList<>();
        char[] chars = s.toCharArray();
        char aChar = chars[0];
        char bChar = chars[3];
        char cChar = chars[1];
        char dChar = chars[4];
        for (char i = aChar; i <= bChar; i++) {
            for (char j = cChar; j <= dChar; j++) {
                char[] t = new char[2];
                t[0] = i;
                t[1] = j;
                ret.add(new String(t));
            }
        }
        return ret;
    }
}
