package com.weibin.day17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author april
 * @date 2023-11-13
 * @description
 */
public class Leet1380 {

    public static void main(String[] args) {
        int[][] m = new int[][]{{3,7,8}, {9,11,13}, {15,16,17}};
        luckyNumbers(m);
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> r = new ArrayList<>();
        int cl = matrix[0].length;
        for (int[] value : matrix) {
            int m = value[0];
            int mi = 0;
            for (int j = 0; j < cl; j++) {
                int matrix1 = value[j];
                if (m > matrix1) {
                    mi = j;
                    m = matrix1;
                }
            }
            System.out.println(mi);
            int max = matrix[0][mi];
            for (int[] ints : matrix) {
                int matrix1 = ints[mi];
                if (max < matrix1) {
                    max = matrix1;
                }
            }

            if (max == m) {
                r.add(max);
            }

        }
        return r;
    }
}
