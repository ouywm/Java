package com.itheima.operator;

public class OperatorDemo5 {
    /*
        短路逻辑运算符:

            &:      没有短路效果无论左边是true,false右边都要执行

            &&:     具有短路效果,左边是false,右边不执行了
                    左边为true,右边继续执行

            |:      没有短路效果无论左边是true,false右边都要执行

            ||:     具有短路效果,左边是false,右边不执行了
                    左边为false,右边继续执行
------------------------------------------------------------------------

            常用逻辑运算符:    &&      ||      !
     */
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        boolean result = ++x > 5 && y-- < 4;

        System.out.println(x);          //4
        System.out.println(y);          //3
        System.out.println(result);     // false
    }
}
