package com.itheima.permissions;

public class PermissionsDemo {
    /*
        权限修饰符：

                private : 同一个类中

                (default) : 同一个类中，同一个包

                protected : 同一个类中，同一个包,不同包的子类当中
                                     TODO: 继承


                public : 任意位置访问
     */
    public static void main(String[] args) {

        Student stu = new Student();

        stu.age = 23;

        stu.show();
    }
}
