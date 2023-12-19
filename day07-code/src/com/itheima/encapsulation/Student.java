package com.itheima.encapsulation;

public class Student {
    /*
        1.私有成员变量(为了保证数据的安全性)

        2.针对私有的成员变量，提供setXxx和getXxx方法

                set : 设置

                get : 获取
     */
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄有误，请检查是否是1~120之间");
        }
    }
}
