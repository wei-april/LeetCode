package com.weibin.day12;

import java.util.Arrays;

/**
 * @author april
 * @date 2023-10-11
 * @description
 */
public class Leet1051 {

    public static void main(String[] args) {
        int[] a = {1,1,4,2,1,3};
        heightChecker(a);
    }

    public static int heightChecker(int[] heights) {
        int[] r = Arrays.copyOf(heights, heights.length);
        int t = 0;
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != r[i]) {
                t++;
            }
        }
        return t;
    }
}
