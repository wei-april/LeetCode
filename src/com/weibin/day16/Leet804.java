package com.weibin.day16;

import java.util.HashSet;
import java.util.Set;

/**
 * @author april
 * @date 2023-11-07
 * @description
 */
public class Leet804 {

    public static void main(String[] args) {

        System.out.println('a' - 0);
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                int i1 = word.charAt(i) - 97;
                sb.append(morse[i1]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
