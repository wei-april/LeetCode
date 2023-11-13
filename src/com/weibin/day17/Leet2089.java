package com.weibin.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author april
 * @date 2023-11-13
 * @description
 */
public class Leet2089 {

    public static void main(String[] args) {

    }

    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> r = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                r.add(i);
            }
        }

        return r;
    }
}
