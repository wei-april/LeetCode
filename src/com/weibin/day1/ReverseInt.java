package com.weibin.day1;

import java.math.BigInteger;

/**
 *  @author Weibin on 2018/7/4.
 *  @version 1.0
 *  
 */
public class ReverseInt {
    public static int reverse(int x) {
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            String result = sb.reverse().toString();
            if (result.charAt(result.length() - 1) == '-') {
                if (new BigInteger(result).compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) == -1) {
                    return 0;
                } else {
                    return Integer.parseInt("-" + result.substring(0, result.length() - 1));
                }
            }

            if (new BigInteger(result).compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) == 1) {
                return 0;
            } else {
                return Integer.parseInt(result);
            }

        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
