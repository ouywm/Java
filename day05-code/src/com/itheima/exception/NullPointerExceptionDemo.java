package com.itheima.exception;

/*
    空指针异常 : NullPointerException

    原因 : 当引用数据类型的变量,被复制为null之后,就代表跟堆内存的链接被切断了
            这时候还想去访问堆内存的数据,就会出现空指针异常

 */
public class NullPointerExceptionDemo {
    public static void main(String[] args) {

        int[] arr = {11,22,33};

        arr = null;

        System.out.println(arr[0]);
    }

}
