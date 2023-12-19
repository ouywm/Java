package com.itheima.array1;

public class ArrayDemo1 {
    public static void main(String[] args) {

        arrayTest2();
    }

    /*

        数组介绍 : 一种容器,可以存储同种数据类型的多个值

        数组的使用场景 : 发现手里的数据有多哥个,并且这多个数据还属于同一组数据,就可以考虑使用数组容器维护

        初始化 : 在内存中,为数组容器开辟空间,并将数据存入容器的过程

        数组的定义格式 :

                1. 数据类型[] 数组名;

                2.数据类型 数组名[];

                注意 : 这种定义格式,定义出来的,只是数组类型的变量而已,内存中还没有创建出数组容器.

     */
    public static void arrayTest1() {
        int[] array;

        int array2[];

    }

    /*
        数组的静态初始化 :

                1. 完整格式 :

                        数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3};

                2. 简化格式 :
                        数据类型[] 数组名 = {元素1,元素2,元素3};


        打印数组名:
            [I@4eec7777

            @ : 分隔符
            [ : 当前空间,是数组类型的
            I : 当前数组类型,是int类型

            4eec7777 : 数组的十六进制内存地址

     */

    public static void arrayTest2() {
        int[] arr1 = {1, 2, 3, 4, 5};
        double[] arr2 = {1.1, 1.2, 1.3};

        System.out.println(arr1);
        System.out.println(arr2);
    }
}
