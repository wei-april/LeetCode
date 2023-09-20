package com.weibin.day6;

import java.util.List;

/**
 * @author april
 * @date 2023-09-20
 * @description
 */
public class Leet2859 {

    public static void main(String[] args) {

    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int r = 0;
        for (int i = 0; i < nums.size(); i++) {
            int i1 = Integer.bitCount(i);
            if (i1 == k) {
                r += nums.get(i);
            }
        }
        return r;
    }
}
