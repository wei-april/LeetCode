package com.april.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author april
 * @date 2023-11-16
 * @description
 */
public class Leet1812 {
    public static void main(String[] args) {

        System.out.println((int)'a');
        char st = 'a';
        char end = 'h';
        List<String> a = new ArrayList<>();
        for (char i = st; i <= end ; i++) {
            if ((i - 97) % 2 == 0) {
                for (int j = 1; j <= 8; j+=2) {
                    a.add(String.valueOf(i) + j);
                }
            } else {
                for (int j = 2; j <= 8; j+=2) {
                    a.add(String.valueOf(i) + j);
                }
            }
        }

        System.out.println(a);
    }

    public boolean squareIsWhite(String coordinates) {
        List<String> list = Arrays.asList("a1", "a3", "a5", "a7", "b2", "b4", "b6", "b8", "c1", "c3", "c5", "c7", "d2", "d4", "d6", "d8", "e1", "e3", "e5", "e7", "f2", "f4", "f6", "f8", "g1", "g3", "g5", "g7", "h2", "h4", "h6", "h8");
        return list.contains(coordinates);
    }
}
