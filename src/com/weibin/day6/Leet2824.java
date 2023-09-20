package com.weibin.day6;

import java.util.List;

/**
 * @author april
 * @date 2023-09-20
 * @description
 */
public class Leet2824 {

    public static void main(String[] args) {

    }

    public int countPairs(List<Integer> nums, int target) {

        int r = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    r++;
                }
            }
        }

        return r;
    }
}
