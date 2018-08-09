package com.weibin.day2;


/**
 *  @author Weibin on 2018/7/19.
 *  @version 1.0
 *  
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        String[] result = s.split(" ");
        StringBuffer sb = new StringBuffer();

        for (String tmp: result) {
            sb.append(new StringBuffer(tmp).reverse() + " ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
