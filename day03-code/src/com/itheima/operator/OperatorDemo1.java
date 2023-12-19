package com.itheima.operator;

public class OperatorDemo1 {
    /*
        赋值运算符:

            1.基本的赋值运算符

                = : 将等号右边的数据,赋值给左边的变量

            2.扩展赋值运算符
                += :    将符号左右两边的数据,做加法运算,再将结果赋值给左边

                -= :    将符号左右两边的数据,做减法运算,再将结果赋值给左边

                *= :

                /= :

                %= :
                        int num  = 10;

                        num += 20;          // num = num + 20;

                        System.out.println(num);

-------------------------------------------------------------------
        细节补充:
                扩展运算符,自带强制转换
                    short s = 1;
                    s = s+1;
     */
    public static void main(String[] args) {

        int num = 10;
        num += 20;          // num = num + 20;
        System.out.println(num);

        short s = 1;

        s = (short) (s + 1);

        short a1 = 1;

        a1 += 1;

        System.out.println(a1);

        double a = 12.3;

        int b = 10;

        b += a;

        System.out.println(b);
    }

}
