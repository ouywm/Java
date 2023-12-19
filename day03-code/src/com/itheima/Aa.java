package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Aa {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] chs = getContents();

        String a = getString(chs);

        System.out.println(a);

    }

    private static String getString(char[] chs) {
        Random random = new Random();
        String a = "";
        for (int j = 0; j < 5; j++) {
            int RandomIndex = random.nextInt(chs.length);
            a += chs[RandomIndex];
        }
        return a;
    }

    private static char[] getContents() {
        char[] chs = new char[26 + 26 + 10];

        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            chs[index] = c;
            index++;

        }
        System.out.println();
        for (char c = 'A'; c <= 'Z'; c++) {
            chs[index] = c;
            index++;


        }
        System.out.println();
        for (char c = '0'; c <= '9'; c++) {
            chs[index] = c;
            index++;


        }
        return chs;
    }

}





