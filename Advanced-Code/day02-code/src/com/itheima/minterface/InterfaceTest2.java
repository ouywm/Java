package com.itheima.minterface;

import com.itheima.a.Inter;

public class InterfaceTest2 {
    /*
        接口的成员特点 ：

            1. 成员变量 : 只能定义常量，因为系统会默认加入三个关键字
                                public static final

                                - 这三个关键字没有顺序关系


            2.成员方法 : 只能是抽象方法，因为系统会默认机上两个关键字
                                public abstract


            3.构造方法 : 没有
     */
    public static void main(String[] args) {
        MyInterImpl myInterImpl = new MyInterImpl();
        myInterImpl.show();

        //跨包 因为是默认public
        System.out.println(Inter.num);
    }
}

interface MyInter {

    //默认加
    public static final int NUM = 10;

    void show();

    void method();
}

class MyInterImpl extends Object implements MyInter {
    public MyInterImpl() {
        //调用构造方法的是Object里面的构造方法
        super();
    }

    @Override
    public void method() {

    }

    public void show() {
        //无法给设为final的变量赋值
        //num = 20;
        //干爹的成员变量还是可以访问的，也干爹也是爹，继承到了干爹的成员变量
        //static 直接用类名调用
        System.out.println(MyInter.NUM);
    }
}