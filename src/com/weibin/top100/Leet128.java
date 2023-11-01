package com.weibin.top100;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author april
 * @date 2023-10-31
 * @description
 */
public class Leet128 {

    public static void main(String[] args) {
        int[] a = new int[]{0,3,7,2,5,8,4,6,0,1};

        longestConsecutive(a);
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        int r = 1;
        for (int n : nums) {
            set.add(n);
        }

        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int tl = 1;
                int t = n;
                while (set.contains(t + 1)) {
                    t++;
                    tl++;
                }

                r = Math.max(r, tl);
            }
        }

        return r;
    }
}
