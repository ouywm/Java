package com.itheima.Polymorphism;

public class PolymorphismTest2 {
    /*
        多态的成员访问特点：
            1.成员变量 :  编译看左边(父类),运行看左边(父类)


            2.成员方法  : 编译看左边(父类),运行看右边(子类)
                                在编译的时候，会检查父类中有没有这个方法
                                        没有： 编译报错
                                        有 ： 编译通过，但是运行的时候，一定会执行子类的方法逻辑

                                原因 ： 担心你调用的方法，在父类中是一个抽象方法


           ------------------------------------------------------------
           多态创建对象，调用静态成员 :

                    静态的成员，推荐类名调用
                    细节： 静态的成员，可以使用对象名调用，但这是一种假像
                                        - 生成字节码文件，会自动将对象名调用改成类名调用

     */
    public static void main(String[] args) {

        Fu f = new Zi();
        System.out.println(f.num); // 10】
        f.show(); // Zi...show
        f.print();// Fu...print

        System.out.println("--------------");
        Inter i = new InterImpl();
        i.method(); // method...

    }
}

interface Inter {
    void method();
}

class InterImpl implements Inter {
    @Override
    public void method() {
        System.out.println("method...");
    }
}

class Fu {
    int num = 10;

    public void show() {
        System.out.println("Fu... show");
    }

    public static void print() {
        System.out.println("Fu...print");

    }
}

class Zi extends Fu {
    int num = 20;

    @Override
    public void show() {
        System.out.println("Zi...show");
    }

    public static void print() {
        System.out.println("Zi...print");

    }
}