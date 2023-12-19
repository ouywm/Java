package com.itheima.mstatic;

public class StaticDemo1 {
    /*
        static 关键字 : 修饰符，可以修饰变量，成员方法

        特点 ：

                1.被类的所有对象所共享
                2.多了一种调用方式，可以通过类名调用(推荐使用类名调用)
                3.随着类的加载而加载，优先于对象存在
     */
    public static void main(String[] args) {

        Student stu1 = new Student();


        stu1.name = "张三";
        stu1.age = 23;
        Student.school = "传智专修学院";

        System.out.println(stu1.name + "," + stu1.age + "," + stu1.school);

        System.out.println("--------------------");


        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 24;

        System.out.println(stu2.name + "," + stu2.age + "," + Student.school);

        System.out.println("--------------------");
        Student stu3 = new Student();


        System.out.println(stu3.name + "," + stu3.age + "," + stu3.school);
    }
}
