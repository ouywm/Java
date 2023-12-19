package com.itheima.string.method;

public class StringMethodDemo2 {
    /*

        String类用于遍历的方法：

             public char[] toCharArray()将此字符串转换为一个新的字符数组。

             public char charAt(int index)返回指定索引处的 char 值

             public  int length()返回此字符串的长度。

     */
    public static void main(String[] args) {


    }

    /**
     * 字符串遍历的第二种方式
     */
    private static void print2() {
        String s = "itheima";


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    /**
     * 字符串的第一种遍历方式
     */
    private static void print1() {
        String s = "itheima";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
