package com.weibin.day2;

import java.util.ArrayList;

/**
 *  @author Weibin on 2018/7/19.
 *  @version 1.0
 *  
 */
public class FindWords {

    private static char[] col1 = new char[]{'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'};
    private static char[] col2 = new char[]{'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'};
    private static char[] col3 = new char[]{'Z','X', 'C', 'V', 'B', 'N', 'M'};

    public String[] findWords(String[] words) {
        ArrayList<String> ret = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if (findChar(col1, words[i]) || findChar(col2, words[i]) || findChar(col3, words[i])){
                System.out.println("存在...");
                ret.add(words[i]);
            }else {
                System.out.println("不存在...");

            }
        }

        return ret.toArray(new String[ret.size()]);
    }

    public boolean findChar(char[] target, String sou){
        boolean flag = true;
        for (int i = 0; i < sou.length(); i++) {
            for (int j = 0; j < target.length; j++) {
                if (sou.toUpperCase().charAt(i) != target[j]) {
                    flag = false;
                } else {
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        //String[] test = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        //System.out.println(findWords(test));
        //String[] res = findWords(test);
        //for (int i = 0; i < res.length; i++){
        //    System.out.println(res[i]);
        //}
    }
}
