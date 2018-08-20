package com.weibin.day5;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author Weibin on 2018/8/20.
 *  @version 1.0
 *  
 */
public class Solution3 {

    public static void main(String[] args) {
        List<String> ret;
        ret = fizzBuzz(15);
        for (String re:
             ret) {
            System.out.println(re);
        }
    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i%3 == 0 && i%5 == 0){
                ret.add("FizzBuzz");
            }else if (i%3 == 0){
                ret.add("Fizz");
            }else if (i%5 == 0){
                ret.add("Buzz");
            }else {
                ret.add(String.valueOf(i));
            }

        }

        return  ret;
    }
}
