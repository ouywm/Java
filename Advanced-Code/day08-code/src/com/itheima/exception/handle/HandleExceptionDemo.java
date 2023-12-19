package com.itheima.exception.handle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HandleExceptionDemo {
    /*
        异常的处理方式：

               1.try{}...catch捕获异常

                        好处 ： 异常对象可以被捕获，后续的代码可以继续执行

                        格式 :

                                try{
                                    肯能会出现异常的代码块
                                }catch(异常名称 对象名){
                                    异常的处理方案
                                }

                        执行流程 ：

                                1.执行try{}中的代码，看是否有异常对象产生
                                2.没有： catch就不会捕获，后续代码继续执行
                                3.有 ： catch捕获异常对象，执行catch{}中的处理方案，后续代码继续运行

               2.throws 抛出异常


     */
    public static void main(String[] args) {

    }

    public static void method() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse("abc");
        System.out.println(date);
    }
    public static void TryCatchDemo(){
        System.out.println("开始");
        try {
            int[] arr = null;
            System.out.println(arr[10]);
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {       //ArithmeticException e = new  ArithmeticException();
            System.out.println("捕获了运算异常");
        } catch (NullPointerException e) {      //NullPointerException e = new NullPointerException();
            System.out.println("捕获了空指针异常");
        }catch(Exception e){
            System.out.println("捕获了异常");
        }
        System.out.println("结束");
    }
}
