package com.itheima.loop;

public class LoopDemo2 {
    public static void main(String[] args) {

        method();
    }
    /*
        for 循环 : 用于控制循环的那个变量,在循环结束之后,就会从内存中消失,循环结束后,不能继续使用

        while 循环 : 用于控制循环的那个变量,再循环结束后,不会从内存中消失,循环结束之后,可以继续使用

     */

    public static void method() {
        for (int i = 1; i <= 5; i++ ) {

        }
//----------------------------------------------------------------
        int i = 1;
        while ( i <= 5){
            System.out.println("...");
            i++;
        }
        System.out.println(i);
    }
}
