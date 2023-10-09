package com.weibin.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author april
 * @date 2023-10-09
 * @description
 */
public class Leet2341 {

    public static void main(String[] args) {
        int[] a = new int[] {1,3,2,1,3,2,2};
        System.out.println(numberOfPairs1(a));
    }

    public static int[] numberOfPairs(int[] nums) {
        int[] r = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

       List<Integer> list = new ArrayList<>(map.values());

        list.forEach(ll -> {
            int i = ll / 2;
            int i1 = ll % 2;
            if (ll > 1) {
                r[0] = r[0] + i;
            }
            r[1] = r[1] + i1;
        });
        return r;
    }

    public static int[] numberOfPairs1(int[] nums) {
        int[] r = new int[2];
        if (nums.length == 1) {
            return new int[] {0, 1};
        }

        int[] t = new int[101];

        for (int i = 0; i < nums.length; i++) {
            t[nums[i]] = t[nums[i]] + 1;
        }

        for (int i = 0; i < 101; i++) {
            int j = t[i] / 2;
            int j1 = t[i] % 2;
            if (t[i] > 1) {
                r[0] = r[0] + j;
            }
            r[1] = r[1] + j1;
        }

        return r;
    }
}
