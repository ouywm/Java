package com.itheima.overload;

public class OverloadDemo {
    /*
        方法重载(Overload):方法与方法之间的一种关系

         目标1:能够独立识别方法与方法之间,是否是正确重载

                - 在同一个类当中方法名相同,参数不同,与返回值无关
                        参数不同:1.类型不同,2.个数不同,3.顺序不同

          目标2:能够理解方法重载带来的好处
                - 不需要记忆过多繁琐的名字了
     */
    public static void main(String[] args) {

methond(1,2);
    }
    public static void methond(int a , int b){

        System.out.println(10);
        System.out.println(12.3);
        System.out.println("abc");
        System.out.println('a');
        System.out.println(true);
    }
    public static void methond(int a , int b, int c){

    }
}
