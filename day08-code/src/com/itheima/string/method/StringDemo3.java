package com.itheima.string.method;

public class StringDemo3 {
    /*
        String类的截取功能:

            public  String substring(int beginIndex)  : 根据传入的索引开始做截取，截取到字符串的末尾
                返回一个新的字符串，它是此字符串的一个子字符串。


            public  String substring(int beginIndex, int endIndex) : 根据传入的开始和结束索引，对字符串截取
                返回一个新字符串，它是此字符串的一个子字符串。


                                        - 包含头，不包含尾
                                        - 包头不包尾

            注意 ： 截取出来的内容，是作为新的字符串返回，不要忘记找变量接收
     */

    public static void main(String[] args) {

        String s = "itheima";

        String result = s.substring(0, 2);
        System.out.println(result);
    }

    private static void method() {
        String s =  "itheima";
        String result = s.substring(2);
        System.out.println(result);
    }
}
