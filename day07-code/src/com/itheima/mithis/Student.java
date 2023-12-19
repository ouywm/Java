package com.itheima.mithis;

public class Student {

    String name;

    public void sayHello(String name) {

        System.out.println(name);

        System.out.println(this.name);

        this.method();

    }

    public void method() {
        System.out.println("method .... ");
    }

    public void print(){
        System.out.println("print方法中打印this关键字--->"+this );
    }
}
