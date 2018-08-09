package com.weibin.day1;

/**
 *  @author Weibin on 2018/7/18.
 *  @version 1.0
 *  
 */
public class JudgeCircle {

    public static boolean judgeCircle(String moves) {

        int lr = 0;
        int ud = 0;

        for (int i = 0; i < moves.length(); i++){
            switch (moves.charAt(i)){
                case 'L':
                    lr++;
                    break;
                case 'R':
                    lr--;
                    break;
                case 'U':
                    ud++;
                    break;
                case 'D':
                    ud--;
                    break;
            }
        }
        if (lr == 0 && ud == 0){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("LR"));
    }
}
