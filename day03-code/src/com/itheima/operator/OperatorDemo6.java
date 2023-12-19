package com.itheima.operator;

public class OperatorDemo6 {
    /*
          三元运算符(三目运算符):

                格式: 判断条件? 值1 : 值2;

           执行流程:
                  1.执行判断条件,若其返回结果是true,false
                  2.true : 值1 就是最终结果
                  3.false :值2 就是最终结果
            需求:求两个整数的最大值

     */
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        //hold?fish:palm;

        int max = num1 > num2 ? num1 : num2;

        System.out.println(max);
    }
}
