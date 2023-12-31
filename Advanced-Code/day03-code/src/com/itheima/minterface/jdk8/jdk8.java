package com.itheima.minterface.jdk8;

public class jdk8 {
    /*
        JDK8版本接口特性：
                1.允许定义抽象方法，需要加入default关键字
                            - 作用 ： 解决接口的升级问题
                            - 注意事项 ：
                                        1.public 可以省略，default不能省略
                                        2.默认方法，实现类是允许重写的但需要去掉default关键字
                                        3.如果实现了多个接口，多个接口中存在相同的默认方法，实现方法，必须重写默认方法

                2.允许定义静态方法
                        - 理解 : 既然接口已经允许方法带有方法体了，干脆也开静态方法，可以类名调用

                        - 注意事项 :

                                    1.public 可以省略，但是static不能省略
                                    2.接口中的静态方法，只允许接口名进行调用，不允许实现类通过对象调用
     */
    public static void main(String[] args) {
        /*AInterImpl a = new AInterImpl();
        a.method();*/
        A.function();
    }
}

interface A {
    default void method() {
        System.out.println("A...method");
    }

    static void function() {
        System.out.println("A...function");
    }
}

interface Inter {
    void show();

    void print();

    public default void method() {
        System.out.println("Inter...method");
    }
}

class AInterImpl implements Inter, A {


    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }

    @Override
    public void method() {
        Inter.super.method();
        A.super.method();
    }

}

class BInterImpl implements Inter {
    @Override
    public void show() {
        System.out.println("BInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("BInterImpl...print");
    }
}
