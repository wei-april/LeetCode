package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-07
 * @description
 */
public class Leet1528 {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] ind = new int[]{4,5,6,7,0,2,1,3};
        restoreString(s, ind);
    }


    public static String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
}
