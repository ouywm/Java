package com.itheima.minterface.jdk9;

import java.net.URL;

public class jdk9 {
    /*
            JDK9接口特性：

                    接口中可以定义私有方法
     */
    public static void main(String[] args) {


    }

}

interface Inter {
    void show();

    void print();

    public default void start() {
        System.out.println("start方法执行...");
        log();
    }

    public default void end() {
        System.out.println("end方法执行...");
        log();
    }

    private void log() {
        System.out.println("日志记录");
    }
}

class AInterImpl implements Inter {
    @Override
    public void show() {

    }

    @Override
    public void print() {

    }

    @Override
    public void start() {
        Inter.super.start();
    }

    @Override
    public void end() {
        Inter.super.end();
    }
}
