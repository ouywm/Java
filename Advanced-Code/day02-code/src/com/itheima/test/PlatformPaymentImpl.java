package com.itheima.test;

public class PlatformPaymentImpl implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("通过支付平台支付了:" + money + "元!");
    }
    public void wxpay(double money) {
        System.out.println("通过微信支付了:" + money + "元!");
    }
}
