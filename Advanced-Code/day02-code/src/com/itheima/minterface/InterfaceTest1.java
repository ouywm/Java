package com.itheima.minterface;

public class InterfaceTest1 {

    /*
        接口 ：体现的思想就是声明[规则]

        思路 ：如果发现一个类所有的组成都是抽象方法
                    - 没有成员变量
                    - 没有普通方法

                    这种类，我们通常会设计为java接口，因为这个存在的唯一价值就只是声明规则了

        --------------------------------------------------------------------------------------

        接口的定义格式 :
                interface 接口名{}

        注意：接口不允许实例化

        接口和类之间是实现关系，通过implements关键字来完成

                class 类名 implements 接口名{}

                实现类(接口的子类)：
                        1.重写所以的抽象方法
                        2.将实现类也变成抽象类

     */
    public static void main(String[] args) {
        //创建实现类对象
        InterImpl ii = new InterImpl();
        ii.method();
        ii.show();

        System.out.println("-------------------------------");

//        Zi zi = new Zi();
//        zi.method();
//        zi.show();
    }
}

//接口
interface Inter {
    public abstract void method();

    public abstract void show();
}

//实现类
class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("method...");
    }

    @Override
    public void show() {
        System.out.println("show...");
    }
}

//实现类也变成抽象类，就可以不用重写抽象方法了
//实现类变成抽象类之后，就不可以new对象了(实例化)
abstract class InterImpl2 implements Inter {
    public InterImpl2() {
        super();
    }

    @Override
    public void method() {
        System.out.println("method...");
    }

    @Override
    public void show() {
        System.out.println("show...");
    }
}

//抽象类的子类
//通过实例化抽象类的子类，就可以调用抽象类中的方法了
//class Zi extends InterImpl2 {
//
//    public Zi() {
//
//    }
//}