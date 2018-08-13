package com.weibin.day5;

import java.util.HashMap;

/**
 *  @author Weibin on 2018/8/13.
 *  @version 1.0
 *  
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        char[] m = magazine.toCharArray();
        char[] r = ransomNote.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        //杂志里的字母依次存进HashMap中，其中key-value分别为字母的值和出现的次数
        for(char c:m){
            if(map.containsKey(c)){
                int num = map.get(c) + 1;
                map.put(c,num);
            }else{
                map.put(c,1);
            }
        }
        //遍历赎金信中的字母，遇到一个字母就去HashMap里看一下，如果不存在直接就返回没戏，
        // 如果存在的话把他的次数减1，直到次数比0小之后就说明没戏了，
        // 如果没发生以上两种情况，那就说明可以完成这份赎金信
        for(char c:r){
            if(map.containsKey(c)){
                int num = map.get(c) - 1;
                if(num < 0)
                    return false;
                map.put(c,num);
            }else
                return false;
        }
        return true;
    }
}
