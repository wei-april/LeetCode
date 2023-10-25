package com.weibin.day13;

/**
 * @author april
 * @date 2023-10-25
 * @description
 */
public class Leet2544 {

    public static void main(String[] args) {
        alternateDigitSum(521);
    }

    public static int alternateDigitSum(int n) {
        int sum = 0;
        boolean p = true;
        int count = 0;
        while (n > 0) {
            int i = n % 10;
            int i1 = n / 10;
            if (p) {
                sum += i;
            } else {
                sum -= i;
            }
            p = !p;
            count++;
            n = i1;
        }
        return count %2 != 0 ? sum : -sum;
    }
}
