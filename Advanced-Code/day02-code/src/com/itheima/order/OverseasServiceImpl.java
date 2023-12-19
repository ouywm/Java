package com.itheima.order;


public class OverseasServiceImpl implements OrderService {

    void check() {
        System.out.println("IP检测");
    }

    /**
     * 创建订单
     */
    @Override
    public void create() {
        System.out.println("国外业务 --- 创建订单");
    }

    /**
     * 查询单个订单
     */
    @Override
    public void findOne() {
        System.out.println("国外业务 --- 查询单个订单");
    }

    /**
     * 查询订单列表
     */
    @Override
    public void findList() {
        System.out.println("国外业务 --- 查询订单列表");
    }

    /**
     * 取消订单
     */
    @Override
    public void cancel() {
        System.out.println("国外业务 --- 取消订单");
    }

    /**
     * 完结订单
     */
    @Override
    public void finish() {
        System.out.println("国外业务 --- 完结订单");
    }

    /**
     * 支付订单
     */
    @Override
    public void paid() {
        System.out.println("国外业务 --- 支付订单");
    }
}
