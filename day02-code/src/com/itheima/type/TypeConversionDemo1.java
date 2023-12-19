package com.itheima.type;

public class TypeConversionDemo1 {
    /*
        类型转换 - 隐式转换

            介绍:讲取值范围小的数据或变量,给取值范围大的变量赋值,可以直接赋值

            取值范围从大到小
                byte -->short --> int --> long --> float --> double

                问题:
                    float占用四个字节,为什么放在了long(八个字节)的后面
                解释:
                    虽然float占用四个字节,但是[取值范围]要比八个字节的long更大
                        - 因为小数二进制存储形式,更加节省内存
     */
    public static void main(String[] args) {

        int a = 10;//10
        double b = a;//10.0
        System.out.println(b);
        System.out.println("--------------------------------");

        long num1 = 123L;
        float num2 = num1;
        System.out.println(num2);
    }
}
