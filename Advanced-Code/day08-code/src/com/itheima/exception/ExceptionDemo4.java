package com.itheima.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {
    /*
        子类重写父类方法时，不能抛出父类没有的异常，或者比父类更大的异常
     */
    public static void main(String[] args) {

        Fu z = new Zi();
        z.show();
    }
}

class Fu {
    public void show() {

    }
}

class Zi extends Fu {
    @Override
    public void show() {

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月d日");

            Date abc = sdf.parse("abc");

        } catch (ParseException e) {

            String message = e.getMessage();

            System.out.println(message);
        }
    }
}