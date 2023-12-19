package com.itheima.type;

public class TypeConversionDemo2 {
    /*
        需求: - 强制转换
            介绍: 将取值范围大的数据或者变量,给取值范围晓得变量赋值,不允许直接赋值,需要加上强制转换

            注意:轻质转换[有可能]会出现精度损失
     */
    public static void main(String[] args) {
        double a = 12.3;
        int b = (int)a;
        System.out.println(b);
        System.out.println("--------------------------------");
        int c = 10;
        byte d = (byte)c;
        System.out.println(d);
        System.out.println("--------------------------------");
        int num1 = 130;
        byte num2 = (byte) num1;
        System.out.println(num2);  //-126
    }
}
