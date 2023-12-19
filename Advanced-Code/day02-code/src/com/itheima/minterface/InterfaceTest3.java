package com.itheima.minterface;

interface InterA {
    void showA();
}

interface InterB {
    void showB();
}

interface InterC extends InterA, InterB {
    void showC();
}

class InterCImpl implements InterC {
    @Override
    public void showA() {

    }

    @Override
    public void showB() {

    }

    @Override
    public void showC() {

    }
}

public class InterfaceTest3 {
    /*
            接口和类的各种关系：

                1.类和类之间 ： 继承关系，只支持单继承，不支持多继承，但是可以是多层继承

                2.类和接口之间 ： 实现关系，也可以多实现，甚至可以在继承一个类的同时，实现多个接口

                3.接口和接口之间 ： 继承关系，可以单继承，可以多继承
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.show2();
    }
}


class Fu {
    public void show() {
        System.out.println("Fu...show");
    }

    public void show2() {
        System.out.println("Fu...show2");

    }
}

interface A {
    void show();

    void show2();

}

interface B {
    void show();

    void show2();
}

class Zi extends Fu implements A, B {

}