package com.itheima.string.method;

public class StringMethodDemo1 {
    /*
        String类用于比较的方法 ：

                public boolean equals(Object anObject) 将此字符串与指定的对象比较。

                public boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写。


         */
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");


        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("-------------------");

        String ss1 = "abc";
        String ss2 = "ABC";
        //区分大小写
        System.out.println(ss1.equals(ss2));    //false
        //不区分大小写
        System.out.println(ss1.equalsIgnoreCase(ss2));  //true
    }
}
