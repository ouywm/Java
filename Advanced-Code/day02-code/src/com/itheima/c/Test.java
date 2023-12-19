package com.itheima.c;

import com.itheima.a.Student;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();

        // 使用全类名去创建对象 ： 包名 + 类名
        com.itheima.b.Student stu2 = new com.itheima.b.Student();
        stu2.sleep();
    }
}
