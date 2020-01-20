/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game1A2B;

/**
 *
 * @author 小官
 */
public class A1B2 {

public static String creatAnswer() {
        String Ans = "";
        for (int i = 0; i < 4; i++) {
            Ans = Ans + String.valueOf((int) (Math.random() * 10));
            for (int j = 0; j < i; j++) {
                if (Ans.charAt(j) == Ans.charAt(i)) {
                    i--;
                    break;
                }
            }
        }
        return Ans;
    }

 public static boolean checkLength(String Guess) {
        if (Guess.length() != 4) {
            return false;
        } else {
            return true;
        }
    }
public static boolean checkAllisNum(String Guess) {
        boolean b1, b2, b3, b4;
        int n1 = Guess.charAt(0);
        int n2 = Guess.charAt(1);
        int n3 = Guess.charAt(2);
        int n4 = Guess.charAt(3);
        b1 = Character.isDigit(n1);
        b2 = Character.isDigit(n2);
        b3 = Character.isDigit(n3);
        b4 = Character.isDigit(n4);
        
        if (b1 == true && b2 == true && b3 == true && b4 == true) {
            return true;
        } else {
            return false;
        }
    }
 public static boolean checkSameNum(String Guess) {
        boolean checkSameNum = true;

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (Guess.charAt(i) == Guess.charAt(j)) {
                    checkSameNum = false;
                }
            }
        }
        return checkSameNum;
    }
 public static String show1A2B(String Ans, String Guess) {
        int A = 0;
        int B = 0;

        if (Ans != Guess) {
            //A 0~3
            for (int i = 0; i < 4; i++) {//i=0~2 charAt位置
                if (Ans.charAt(i) == Guess.charAt(i)) {
                    A++;
                }
            }
            //B 0~4
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (Ans.charAt(j) == Guess.charAt(i)) {
                        B++;
                    }
                }
            }
            B = B - A;
//            if (A == 4) {
//               return Ans;
//            }
        }
        String Result =  A + "A" + B + "B";
        return Result;
    }
}

