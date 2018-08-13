package com.weibin.day5;

/**
 *  @author Weibin on 2018/8/13.
 *  @version 1.0
 *  
 */
public class Solution implements GuessGame {

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<high){
            //这里的mid不可以使用 int mid = （low+high）/2;
            int mid = low + (high-low)/2;
            int res = guess(mid);
            if(res==0) {
                //如果对方猜对了直接输出~
                return mid;
            }else if(res == 1){
                //如果对方猜的数字，比我们设置的数字小！那就把mid赋值给low，让对方下次猜的数变大~
                low = mid+1;
            }else {
                //其余情况只有对方猜的数字，比我们设置的数字大！那就把mid赋值给high，让对方下次猜的数变小~
                high = mid-1;
            }
        }
        //最后如果在while中，没有猜对（基本上不可能）！那他猜的这个数字，一定是现在的low了~~
        return low;
    }

    @Override
    public int guess(int num) {
        return 0;
    }
}
