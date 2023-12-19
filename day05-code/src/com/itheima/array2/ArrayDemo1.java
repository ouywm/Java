package com.itheima.array2;

public class ArrayDemo1 {

    /*
        细节 : 二位数组在存储一维数组的时候,具体储存的是一维数组的地址值

        二位数组的访问格式 :

                    数组名[m索引][n索引] :

                    m索引 : 指定访问哪一个一维数组

                    n索引 : 访问一维数组中的哪一个元素

     */
    public static void main(String[] args) {

        int[][] arr = {
                {11, 22, 33},
                {44, 55, 66}
        };
        System.out.println(arr);            //[[I@4eec7777

        System.out.println(arr[0]);         //[I@3b07d329
        System.out.println(arr[1]);         //[I@41629346

        System.out.println(arr[1][1]);
        System.out.println(arr[0][2]);
    }
}
