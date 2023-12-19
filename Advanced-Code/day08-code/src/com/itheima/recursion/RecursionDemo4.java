package com.itheima.recursion;

public class RecursionDemo4 {
    public static void main(String[] args) {

        int result = monkey(1);
        System.out.println(result);

    }

    public static int monkey(int num) {
        if (num == 10) {
            return 1;
        } else {
            //公式 : (后一天的桃子数量 + 1) * 2
            // num = 9
            return (monkey(num + 1) + 1) * 2;
        }
    }
}
