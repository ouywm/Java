package com.itheima.string;

import com.itheima.domin.Student;

public class StringDemo1 {
    /*
        String 的特点

            1.Java 程序中所有双引号，都是String这个类的对象

            2.字符串一旦被创建，就不可更改
                如果想要更改，只能用新的对象，做替换


            3.String字符串虽然不可以改变，但是可以被共享

                字符串常量池 ： 当我们使用双引号创建字符串对象的时候，会检查常量池中是否存在该数据
                     不存在 ：创建
                     存在 ：  直接复用
     */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
    }
}
