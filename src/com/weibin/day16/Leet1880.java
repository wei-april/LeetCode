package com.weibin.day16;

/**
 * @author april
 * @date 2023-11-11
 * @description
 */
public class Leet1880 {

    public static void main(String[] args) {
        wordSum("acb");
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return wordSum(firstWord) + wordSum(secondWord) == wordSum(targetWord);
    }

    public static int wordSum(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i) - 'a');
        }
        return Integer.parseInt(sb.toString());
    }
}
