package com.itheima.array1;

public class ArrayDemo2 {
    public static void main(String[] args) {

        arrayTest();
    }
    /*
        数组元素的访问格式 :

                数组名[索引];

                索引 : 数组容器中间所对应的编号,编号从0开始,逐个加一增长

     */
    public static void arrayTest() {
        int[] array = {11, 22, 33, 44, 55};

        //取出数组中 22 元素,打印在控制台
        System.out.println(array[1]);

        //判断数组中的第一个元素,是奇数还是偶数
        if (array[0] % 2 == 0) {
            System.out.println(array[0] + "是偶数");
        } else {
            System.out.println(array[0] + "是奇数");
        }

        //修改数组中的第三个元素,为 66

        array[2] = 66;

        System.out.println(array[2]);

        //根据数组中第四个元素,决定在控制台打印多少次HelloWorld

        for (int i = 1; i <= array[3]; i++) {
            System.out.println("Hello World");
        }
    }
}
