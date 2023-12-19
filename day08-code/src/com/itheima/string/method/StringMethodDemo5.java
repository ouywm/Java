package com.itheima.string.method;

public class StringMethodDemo5 {
    /*
        String类的切割方法 ：

                public String[] split(String regex) ：根据传入的字符串，作为规则，切割当前字符串

        建议 ： 先正常指定切割规则，后来发现没有得到自己想要的效果，就可以尝试在规则前面，加入\\

     */
    public static void main(String[] args) {

        String s = "192+168+1+1";

        String[] sArr = s.split("\\+");

        for (int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i]);
        }
    }
}