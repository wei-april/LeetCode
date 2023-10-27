package com.weibin.day14;

/**
 * @author april
 * @date 2023-10-27
 * @description
 */
public class LeetLCR120 {

    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 3, 0, 5, 0};
        findRepeatDocument(a);
    }

    public static int findRepeatDocument(int[] documents) {

        int[] t = new int[100000];
        int r = -1;
        for (int i = 0; i < documents.length; i++) {
            if (t[documents[i]] == 1) {
                r = documents[i];
                break;
            }
            t[documents[i]] += 1;
        }

        return r;
    }
}
