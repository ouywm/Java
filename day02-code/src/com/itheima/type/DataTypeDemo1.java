package com.itheima.type;

public class DataTypeDemo1 {
    /*
    数据类型
        1.基本数据类型
            整数:
                byte            一个字节          取值范围  -128~127
                short           两个字节
                int             四个字节
                long            八个字节
            小数:
                float(单精度)    四个字节
                double(双精度)   八个字节
            字符:
                char            两个字节
            布尔:
            boolean             一个字节
        2.引用数据类型

        ----------------------------------------------------------------

        使用思路:
                1.整数类型:  首选int 如果发现int装不下了,定义long类型变量需要加入L的标识
                2.小数类型:  首选double,非要用float类型需要加入F标识
 */
    public static void main(String[] args) {

//        int tel = 15611111111;

        long num = 18911111111L;

        double height = 183.4;
        float  height1 = 198.5F;

        char gender = '男';
        boolean flag = false;

    }
}
