package com.itheima.test;

public class Test3 {

    /*
        == :
                1.基本数据类型 : 比较数据值

                2.引用数据类型 : 比较地址值

     */
    public static void main(String[] args) {

        int[] arr1 = {11, 22, 33};

        int[] arr2 = {11, 22, 33};

        boolean result = checkArrayContent(arr1, arr2);

        System.out.println(result);


    }
    /*

        需求 : 定义一个方法,比较两个数组的内容是否相同
        要求 : 长度,内容,顺序完全相同

     */

    public static boolean checkArrayContent(int[] arr1, int[] arr2) {

        //1.比较数组的长度
        if (arr1.length != arr2.length) {
            return false;

        }
        //代码要是能走到这里,代表数组的长度肯定是相同的
        //数组的长度相同,意味着索引也是相同的

        //{11,22,33}
        // 0  1  2
        //{44,55,66}


        //比较数组中元素的内容

        for (int i = 0; i < arr1.length; i++) {
            // i = 0 1 2

            //arr1[i] : 第一个数组中的每一个元素
            //arr2[i] : 第二个数组中的每一个元素
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        //代码要是能够走到这,意味着数组的长度和内容顺序是完全相同的

        return true;

    }
}
