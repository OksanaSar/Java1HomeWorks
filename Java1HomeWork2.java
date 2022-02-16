/**
 *Java1. Homework 2.
 *
 * @author Sarycheva Oksana
 * @version 16.02.2022
 */

class Java1HomeWork2 {
    public static void main(String[] args){
        System.out.println(varSum(20, -10));
        showTheSign(-17);
        System.out.println(showNegative(23));
        printString("It's winter!", 5);
    }
    
    static boolean varSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
        }
    
    static void showTheSign(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }
    
    static boolean showNegative(int a) {
    return a < 0;
    }
    
    static void printString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}