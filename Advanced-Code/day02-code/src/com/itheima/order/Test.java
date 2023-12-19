package com.itheima.order;

import java.util.Scanner;

public class Test {
    /*
            ClassCastException :  类型转换异常

                    在引用类型的强转中，[实际类型]和[目标类型]不匹配，就会出现此异常
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderService orderService = null;
        System.out.println("请输入: 1. 国内订单  2. 国外订单");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                orderService = new OrderServiceImpl();
                break;

            case 2:
                orderService = new OverseasServiceImpl();
                break;
        }
        // instanceof : 判断左边的引用，是否是右边的数据类型
        if (orderService instanceof OverseasServiceImpl) {
            OverseasServiceImpl osi = (OverseasServiceImpl) orderService;
            osi.check();
        }

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.paid();

    }
}
