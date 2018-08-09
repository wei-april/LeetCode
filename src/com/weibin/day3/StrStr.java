package com.weibin.day3;

/**
 *  @author Weibin on 2018/8/9.
 *  @version 1.0
 *  
 */
public class StrStr {

    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }

    public static int strStr(String haystack, String needle) {

        if (haystack == null || needle == null || haystack == "" || needle == "" || needle.length() == 0){
            return 0;
        }
        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++){
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if (flag == true)
            return i;
        }
        return -1;
    }
}
