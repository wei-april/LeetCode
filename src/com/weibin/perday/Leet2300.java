package com.weibin.perday;

import java.util.Arrays;

/**
 * @author april
 * @date 2023-11-10
 * @description
 */
public class Leet2300 {

    public static void main(String[] args) {
        int[] sp = new int[] {5,1,3};
        int[] po = new int[] {1,2,3,4,5};


        successfulPairs(sp, po, 7);
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] rr = new int[spells.length];
        Arrays.sort(potions);

        for (int i1 = 0; i1 < spells.length; i1++) {
            int spell = spells[i1];
            int l = 0;
            int r = potions.length - 1;
            int t = 0;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if ((long) potions[m] * spell < success) {
                    l = m + 1;
                } else {
                    t = potions.length - m ;
                    r = m - 1;
                }
            }
            rr[i1] = t;
        }
        return rr;
    }
}
