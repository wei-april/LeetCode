package com.weibin.day6;

/**
 * @author april
 * @date 2023-09-19
 * @description
 */
public class Leet1299 {

    public static void main(String[] args) {
        int[] a = new int[]{17,18,5,4,6,1};
        replaceElements2(a);
    }

    public static int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            res[i] = max;
        }

        return res;
    }

    public static int[] replaceElements2(int[] arr) {
        int[] res = new int[arr.length];
        res[res.length - 1] = -1;
        int tmp = -1;
        for (int i = arr.length - 1; i >= 1 ; i--) {
            if (arr[i] > tmp) {
                tmp = arr[i];
            }
            res[i - 1] = tmp;
        }
        return res;
    }
}
