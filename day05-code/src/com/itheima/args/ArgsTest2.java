package com.itheima.args;

public class ArgsTest2 {

    /*
        方法的参数传递问题 :

                1.基本数据类型的 : 传递的是数据值
                2.引用数据类型 : 传递的就是地址值

                问题 : Java这门语言到底是值传递还是址传递?
                回答 : 值传递,地址值也是值


     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        System.out.println("调用change方法前:" + arr[0]);
        change(arr);
        System.out.println("调用chanfe方法后:" + arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 66;
    }
}
