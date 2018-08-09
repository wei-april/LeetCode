package com.weibin.day2;

/**
 *  @author Weibin on 2018/7/26.
 *  @version 1.0
 *  
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {

        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[result] != nums[i]){
                result++;
                nums[result] = nums[i];
            }
        }


        return result + 1;
    }
}
