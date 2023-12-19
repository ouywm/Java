package com.itheima.this_super;

public class Test {
    /*
        开闭原则 : 对功能扩展做开放，对修改代码做关闭
     */
    public static void main(String[] args) {
        A a1 = new A(1, 2, 3);
        A a2 = new A(4, 5, 6);
        A a3 = new A(1, 2, 3, 4);
    }
}

/*
    项目 : Version1.0版本 : 有三个成员变量
    项目 : Version1.1版本 : 新增一个成员变量
 */
class A {
    public A() {
    }

    int a;
    int b;
    int c;
    int d;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
        this(a, b, c);
        this.d = d;
    }
}