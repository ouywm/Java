package com.itheima.inner;

public class AnonClassTest1 {
    /*
        匿名内部类：

            概述：匿名内部类本质上是一个特殊的局部内部类（定义在方法内部）
            前提 ：需要存在一个接口或者类

            格式：
                    new 类名\接口名(){

                    }

                    new 类名(){}  : 代表着继承这个类

                    new 接口名(){} : 代表着实现这个接口




     */
    public static void main(String[] args) {
        //问题： 方法的形参是接口类型，我们传入的是什么？
        //答案：传入的是接口的实现类对象

        userInter(new InterImpl());


    }

    public static void userInter(Inter i) {  // Inter i =new InterImpl();
        i.show();
        i.show2();
    }
}

interface Inter {
    void show();

    default void show2() {
        System.out.println("show2...");
    }
}

class InterImpl implements Inter {
    @Override
    public void show() {
        System.out.println("InterImpl...show...");
    }
}
