package com.itheima.integer;

public class IntegerDemo {
    /*

        包装类： 将基本数据类型，包装成类，类变成引用类型

        ------------------------------------------------

        手动装箱：调用方法，手动将基本数据类型，包装成类

                1.public Integer(int value) : 通过构造方法(不推荐)
                2.public static Integer valueOf(int i ) : 静态方法


         手动拆箱：调用方法，手动将包装类，拆成(转换)基本数据类型

                1.public int inValue() : 以 int 类型返回该 Integer 的值

         从JDK5版本开始，出现了自动拆装箱 ：

                        1.自动装箱 ： 可以将基本数据类型，直接赋值给包装类的变量

                        2.自动拆箱 ： 可以将包装类的数据，直接赋值给基本数据类型变量


                        结论： 基本数据类型，和对应的包装类，可以直接做运算了，不需要担心类型转换的问题了

     */
    public static void main(String[] args) {

        int num = 10;


        Integer i1 = num;



        int i = i1;

        System.out.println(i);
    }

}
