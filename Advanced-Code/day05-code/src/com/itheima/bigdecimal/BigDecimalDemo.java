package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
            BigDecimal  类： 解决小数运算中，出现不精准的情况下

            public BigDecimal (double val) : 不推荐，无法保证小数运算的精确
            -------------------------------------------------
            public BigDecimal (String val)

            public static BigDecimal valueOf(double val)



            注意事项 ：如果使用BigDecimal运算，出现了除不尽的情况，就会出现异常
     */
    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
        System.out.println(bd1.divide(bd2,2, RoundingMode.HALF_UP));
        System.out.println(bd1.divide(bd2,2, RoundingMode.UP));
        System.out.println(bd1.divide(bd2,2, RoundingMode.DOWN));


        BigDecimal result = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        double v = result.doubleValue();
        System.out.println(Math.abs(v));
    }
}
