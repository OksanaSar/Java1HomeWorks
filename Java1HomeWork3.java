/**
 *Java1. Homework 3.
 *
 * @author Sarycheva Oksana
 * @version 22.02.2022
 */
 
 import java.util.Arrays;
  
class Java1HomeWork3 {
    public static void main(String[] args) {
        changeElem();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.println(Arrays.toString(makeArray(5, 10)));
    }
    
    //Замена элементов в целочисленном массиве
    static void changeElem() {
        int[] arr1 = {0, 1, 0, 1 , 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            if (arr1[i] == 1) {
                arr1[i] = 0;
            }
            else {
                arr1[i] = 1;
            }
            System.out.println(arr1[i] + " ");
        }
        System.out.println("");
    }
    
    //Заполнение пустого массива
    static void fillArray() {
        int[] arr2 = new int[100];
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("");
    }        
    
    //Значения массива <6 умножить на 2
    static void changeArray() {
        int[] arr3 = {1, 5, 3, 2 , 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("");
    }
    
    //Заполнение квадратного двумерного целочисленного массива по диагонали
    static void fillDiagonal() {
        int [][] arr4 = new int[6][6];
        //Диагональ слева направо
        for(int i = 0; i < arr4.length; i++) {
            for(int j = 0; j< arr4.length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        
        //Диагональ справа налево
        for(int a = arr4.length - 1; a >= 0; a--) {
            for(int b = 0; b < arr4.length; b++) {
                if (a == b) {
                    arr4[a][b] = 1;
                }
                System.out.print(arr4[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    
    //Метод, возвращающий массив
    static int[] makeArray(int len, int initialValue) {
        int[] arr5 = new int [len];
        for(int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
}