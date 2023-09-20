package com.weibin.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author april
 * @date 2023-09-19
 * @description
 */
public class Leet136 {

    public static void main(String[] args) {
        int[] a = new int[]{2,2,1};
        singleNumber(a);
    }

    public static int singleNumber(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                list.remove(list.indexOf(nums[i]));
            } else {
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }
}
