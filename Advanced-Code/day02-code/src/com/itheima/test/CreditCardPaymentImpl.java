package com.itheima.test;

public class CreditCardPaymentImpl implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("通过信用卡快捷支付了:" + money + "元!");

    }
}
