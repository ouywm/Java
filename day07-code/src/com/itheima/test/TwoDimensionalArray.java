package com.itheima.test;

import java.util.Scanner;

public class TwoDimensionalArray {
    static String[][] name = new String[3][3];
    public static void main(String[] args) {
        TwoDimensionalArray aa = getAa();
        aa.print();
    }

    private static TwoDimensionalArray getAa() {
        Scanner sc = new Scanner(System.in);

        TwoDimensionalArray aa = new TwoDimensionalArray();
        //从键盘录入数据
        for (int i = 0; i < name.length; i++) {
//            name[0][i] = sc.next();
            for (int j = 0; j < name.length; j++) {
                System.out.println("请输入第" + (i + 1) + "行第" + (j + 1) + "列的数据");
                name[j][i] = sc.next();
            }
        }
        return aa;
    }
    /*
    * 输出二维数组
    * */
    private void print() {
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
}
