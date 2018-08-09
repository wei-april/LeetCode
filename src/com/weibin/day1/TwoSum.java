package com.weibin.day1;

import java.util.ArrayList;

/**
 *  @author Weibin on 2018/7/4.
 *  @version 1.0
 *  
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) throws Exception {
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("[" + nums[i] + "," + nums[j] + "]");
                    list.add(i);
                    list.add(j);
                }
            }
        }

        if (list.isEmpty()){
            return null;
        }else {
            int[] res = new int[list.size()];
            for (int i = 0; i < list.size(); i++){
                res[i] = list.get(i);
            }
            return res;
        }

    }
}
