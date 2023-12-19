package com.itheima.string.method;

public class StringMethodDemo4 {
    /*
        String类的替换方法 ：
             public String replace(CharSequence target, CharSequence replacement);

                                参数 1 : 旧值
                                参数 2 ：新值
     */

    public static void main(String[] args) {


        String s = "itheima";

        String result = s.replace("heima", "baima");
        System.out.println(result);
    }
}
