package com.weibin.top100;

/**
 * @author april
 * @date 2023-11-02
 * @description
 */
public class Leet11 {

    public static void main(String[] args) {
        int[] a = new int[]{1,8,6,2,5,4,8,3,7};

        maxArea(a);
    }

    public static int maxArea(int[] height) {
        int r = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int a = (j - i) * Math.min(height[i], height[j]);
            r = Math.max(r, a);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return r;
    }
}
