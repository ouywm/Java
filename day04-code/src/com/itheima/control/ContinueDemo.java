package com.itheima.control;

public class ContinueDemo {
    /*

        continue : 跳过

        注意事项 : continue 只能在循环中使用

        --------------------------------

        break , continue 的共同注意事项:

                下面不允许写代码,因为执行不到,属于无效的代码

     */
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        for (int i = 1; i <= 80; i++) {

            if (i == 3 || i == 7 || i == 14) {
                continue;
            }
            System.out.println("第" + i + "名顾客持48小时核酸证明进入电影院....");
        }
    }
}
