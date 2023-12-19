package com.itheima.inner;

public class LocalClassTest {
    /*
        局部内部类： 放在方法代码块，构造器等执行体当中
     */
    public static void main(String[] args) {

        A a = new A();
        a.show();

    }
}

class A {
    public void show() {
        class B {
            public void method() {
                System.out.println("show...");
            }
        }

        B b = new B();
        b.method();
    }
}