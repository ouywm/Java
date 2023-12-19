package com.itheima.object.tostring;

import java.util.Objects;

public class Student {
    private int age;

    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        //this : stu1
        // o : stu2
        if (this == o) {
            //两个对象做地址的比较，如果内存地址相同，里面的内容肯定是相同的，之间返回true
            return true;
        }
        //代码走到这里，那么地址值肯定是不相同的
        //代码要是能走到这里，代表stu1，肯定不是null
        //stu1不是null，stu2是null，就直接返回false

        //getClass() != o.getClass() : 两个对象字节码是否相同
        //如果字节码不相同，那么类型就不相同，之间返回false
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        //代码要是能走到这里，代表字节码相同，就是类型肯定相同
        //向下转型，转换为子类类型
        Student student = (Student) o;
        //比较
        return this.age == student.age && Objects.equals(this.name, student.name);
    }


    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
