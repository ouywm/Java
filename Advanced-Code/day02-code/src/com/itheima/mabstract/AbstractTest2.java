package com.itheima.mabstract;

public class AbstractTest2 {
    /*
        抽象类的注意事项：
                1.抽象类不能实例化
                        - 如果抽象类允许创建对象，就可以调用内部没有的方法体的，抽象方法了
                2.抽象类存在构造方法
                        - 交给子类，通过super进行访问
                3.抽象类中可以存在普通方法
                        - 可以让子类继承到继续使用
                4.抽象类的子类
                            1).要么重写抽象类中所有的抽象方法
                            2).要么是抽象类
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

abstract class A {
    public abstract void showA();
}

abstract class B extends A {
    @Override
    public void showA() {

    }

    public abstract void showB();
}

class C extends B {

    @Override
    public void showB() {

    }
}

abstract class Fu {
    public Fu() {
        System.out.println("123123");
    }

    public abstract void show();

}

class Zi extends Fu {
    public Zi() {
        super();
    }

    @Override
    public void show() {
        System.out.println("子类重写抽象类中的抽象方法");
    }
}
