package com.itheima.mithis;

public class ThisDemo {

    /*
        情况：成员变量和局部变量重名的情况，Java使用的是就近原则


        问题：使用this关键字进行区分

                this可以区分局部变量和成员变量的重名问题

        --------------------------------

        this关键字的作用：

                this 可以调用本类的成员（成员变量，方法）

                    this.本类成员变量
                    this.本类的成员方法();

                this.省略规则：

                    本类成员方法 ： 没有前提条件，可以直接省略


                    本类成员变量  ： 方法中没有出现重名的变量，这个this才可以省略


                --------------------------------

            this介绍：代表当前对象的引用（地址）

                    - 谁来调用我，我就代表谁

                    - 哪一个对象调用方法，方法中的this，代表的就是哪一个对象



                    stu1.print --->this--->stu1的地址

                    stu2.print --->this--->stu2的地址
     */
    public static void main(String[] args) {

      /*  Student student = new Student();

        student.name = "钢门吹雪";

        student.sayHello("西域狂鸭");*/


        Student stu1 = new Student();

        System.out.println(stu1);
        stu1.print();


        Student stu2 = new Student();

        System.out.println(stu2);

        stu2.print();
    }
}
