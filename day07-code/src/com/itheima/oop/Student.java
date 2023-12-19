package com.itheima.oop;

/*
    前提须知：Java当中想要创建对象，必须要有类的存在，

    类：一组相关属性和行为的集合，将其看做为对象的设计图

    对象：是根据设计图（类）创建的实体

    类和对象的关系：
        1.依赖关系：需要根据类，创建对象
        2.数量关系：根据一个类可以创建多个对象


        类的组成：

            类的本质： 就是对事物进行的描述

                    举例1：我之前有个{学生}，叫做<张三>，今年<23>了，<180多的身高>，平时就喜欢(吃饭)和(学习)。。

                    举例2：前一阵子买了一台<白色>的<海尔>{洗衣机}，花了我<1999块钱>，老心疼了，但是(洗衣服)和(甩干倒)是挺方便的。。。

            属性(名词)：在代码中使用成员变量表示，成员变量跟之前定义变量格式一样，只不过位置发生了改变，类中，方法外面

            行为(行为)：在代码中使用成员方法表示，成员方法跟之前定义方法格式一样，只不过需要去掉 static 关键字
 */
public class Student {

    //属性：姓名，年龄
    String name;
    //行为：学习，吃饭
    int age;

    public void study() {
        int a = 10;
        System.out.println(a);
        System.out.println(name);
        System.out.println("学生学习。。。");
    }

    public void eat() {
        System.out.println();
        System.out.println(age);
        System.out.println("学生吃饭。。。");
    }

}
