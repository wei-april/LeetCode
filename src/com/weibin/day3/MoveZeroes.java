package com.weibin.day3;

/**
 *  @author Weibin on 2018/8/10.
 *  @version 1.0
 *  
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }

    public static void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                for (int j = i + 1; j < nums.length; j ++){
                    int temp = nums[j];
                    nums[j - 1] = temp;
                }
                nums[nums.length - 1] = 0;
            }
        }
    }
}
