package com.weibin.day3;

import java.util.HashMap;
import java.util.Map;

/**
 *  @author Weibin on 2018/8/10.
 *  @version 1.0
 *  
 */
public class MajorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int majorityElement = nums.length/2;

        for (Integer integer : nums){
            Integer count = map.get(integer);
            map.put(integer, count == null ? 1 : count + 1);
        }

        for (int i = 0; i < nums.length; i++){
            if (map.get(nums[i]) > majorityElement){
                return i;
            }
        }

        return 0;
    }
}
