package com.weibin.day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author april
 * @date 2023-11-07
 * @description
 */
public class Leet2814 {

    public static void main(String[] args) {
        String[] n = new String[]{"Mary","John","Emma"};
        int[] h = new int[]{180,165,170};

        sortPeople(n, h);
    }

    public static String[] sortPeople(String[] names, int[] heights) {

        Integer[][] r = new Integer[heights.length][2];

        for (int i = 0; i < heights.length; i++) {
            r[i] = new Integer[]{heights[i], i};
        }

        Arrays.sort(r, (r1, r2) -> r2[0] - r1[0]);

        String[] s = new String[names.length];

        for (int i = 0; i < r.length; i++) {
            Integer integer = r[i][1];
            String name = names[integer];
            s[i] = name;
        }

        return s;
    }
}
