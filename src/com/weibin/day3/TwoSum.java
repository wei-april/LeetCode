package com.weibin.day3;

/**
 *  @author Weibin on 2018/8/10.
 *  @version 1.0
 *  
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
    }

    public static int getSum(int a, int b) {
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }
        //不考虑进位，异或
        int sum = a ^ b;
        //然后计算进位，并将进位的值左移, 弱进位为0则sum为结果
        //若temp部位0，则sum + temp为计算结果
        int temp = (a&b) << 1;
        return getSum(sum, temp);
    }
}
