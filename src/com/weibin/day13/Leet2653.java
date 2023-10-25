package com.weibin.day13;

/**
 * @author april
 * @date 2023-10-25
 * @description
 */
public class Leet2653 {

    public static void main(String[] args) {
        sumOfMultiples(7);
    }

    public static int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += n;
            }

        }

        return sum;
    }
}
