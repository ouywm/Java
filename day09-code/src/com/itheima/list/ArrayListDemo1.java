package com.itheima.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
    /*

            ArrayList集合的使用：

                细节 : 创建String/StringBuilder/ArrayList类的对象，打印对象名，都没有看到地址值，而是元素的内容

                1.构造方法：

                    public ArrayList():创建一个空的集合容器

                2.集合容器的创建细节：

                    ArrayList list = new ArrayList();
                    现象：可以添加任意类型数据
                    弊端：数据不够严谨


                ArrayList<String> list = new ArrayList<String>();

                <> : 泛型

                           目前 ： 使用泛型，可以对集合中存储的数据，进行类限制

                           细节 ： 泛型中，不允许编写基本数据类型

                           问题 ： 那我要是想集合中，储存  整数，小数，字符。。。。这些数据，怎么办呢？？

                           解决 ： 使用基本数据类型，所对应的包装类

                                       byte         Byte
                                       short        Short
                                       int          Integer
                                       long         Long
                                       float        Float
                                       double       Double
                                       boolean      Boolean
                                       char         Character

    */
    public static void main(String[] args) {
        //步骤一 ： 穿件一个集合容器，内部存储11.1 22.2 33.3
        ArrayList<Double> list1 = new ArrayList<Double>();

        list1.add(11.1);
        list1.add(22.2);
        list1.add(33.3);
        //步骤二 ： 创建一个集合容器，内部储存 张三，李四，王五
        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("张三");
        list2.add("李四");
        list2.add("王五");
        //步骤三 ： 在控制台展示两个集合中的元素

        System.out.println(list1);
        System.out.println(list2);
    }
}
