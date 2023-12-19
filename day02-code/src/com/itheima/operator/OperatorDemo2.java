package com.itheima.operator;

public class OperatorDemo2 {
    /*
        自增自减运算符:
            ++:让变量自身的值 + 1
            --:让变量自身的值 - 1
        1.单独使用:一句代码中,只做++,或是--
            ++,-- 在变量的前面还是后面,是没有区别的
                int a = 10;
                a++;
                System.out.println(a); // 11
        2.参与运算使用:
            ++在前,先自增,再操作
                    int a = 10;
                    int b = ++a;
                    System.out.println("a=" + a); // a = 11
                    System.out.println("b=" + b); // b = 11
                ------------------------------------
            ++在后:
                先操作,再自增
                    -将变量原本记录的值提取出来做操作,然后变量再自增
     */
    public static void main(String[] args) {
        int a = 10;
        int b = a++; // b = 10, a = 11
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
