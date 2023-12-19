package com.itheima.test;

public class TypeConversionTest {
    /*
        类型转换面试题:下列代码是否存在错误,如果有请指出说明,并改正

        byte b1 = 3;

        byte b2 = 4;

        byte b3 = b1 + b2;

        错误原因是:b1 和b2 是两个byte类型,在做运算的时候会提升为int 类型
        提升之后,就是两个int在做运算了,运算结果还是int
        将int类型的结果,赋值给了byte类型的量 ,属于大给小,不能直接给
        byte b1 = 3;
        byte b2 = 4;
        byte b3 = (byte)(b1 + b2);
        System.out.println(b3);

        byte b = 3 + 4;
        这里的 3 和 4 是两个字面量,之前说过,所以得默认都是int类型,所以这里应该是两个int类型在做运算
        运算的结果还是int,int类型结果给byte赋值大的给小的,不能直接给



        Java存在常亮优化机制:  会在编译的时候(javac)就会将3和4这两个字面量进行运算

                        产生字节码文件:        byte = 7;


     */
    public static void main(String[] args) {
        byte b = 3 + 4;

    }
}
