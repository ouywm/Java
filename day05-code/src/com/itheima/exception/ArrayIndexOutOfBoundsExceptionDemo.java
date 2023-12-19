package com.itheima.exception;

public class ArrayIndexOutOfBoundsExceptionDemo {

    /*
        数组索引越界异常 : ArrayIndexOutOfBoundsException


        原因 : 访问了不存在的索引

     */
    public static void main(String[] args) {

        int[] arr = {11,22,33};

        System.out.println(arr[10]);
    }


}
