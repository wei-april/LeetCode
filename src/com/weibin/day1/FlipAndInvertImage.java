package com.weibin.day1;

/**
 *  @author Weibin on 2018/7/18.
 *  @version 1.0
 *  
 */
public class FlipAndInvertImage {

    public static int[][] flipAndInvertImage(int[][] A) {
        //反转数组
        for (int i = 0; i < A.length; i++){
            for (int start = 0, end = A[i].length - 1; start <= end; start++, end--){
                int tmp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = tmp;
            }
        }

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                if (A[i][j] == 1){
                    A[i][j] = 0;
                }else {
                    A[i][j] = 1;
                }

            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[][] A =  {{1,1,0},{1,0,1},{0,0,0}};

        int[][] B = flipAndInvertImage(A);

        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[i].length; j++){
                System.out.println(B[i][j]);
            }
            //System.out.println(B[i]);
        }
        //System.out.println(flipAndInvertImage(A));


    }
}
