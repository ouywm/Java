package com.itheima.scanner;
//导包
import java.util.Scanner;
public class ScannerDemo {
    /*
        Scanner键盘录入的三个步骤
            1.找符咒
                import java.util.Scanner;
                位置:class上面
                含义:能够让自己的ScannerDemo,从仓库中,找到Scanner符咒
            2.召唤精灵
                代码: Scanner input = new Scanner(System.in);
                位置:main里面
                含义:从符咒中召唤精灵,给精灵起名字
            3.指挥精灵
                代码: int age = new input.nextInt();  从键盘录入整数,并使用int整形变量接收
                double sum = new input.nextDouble(); 从键盘录入小数,并使用double类型变量接收
                String name = input.next();
    */
    public static void main(String[] args) {
//      召唤精灵,给精灵起名字
        Scanner input = new Scanner(System.in);

        //指挥精灵干活
        int a = input.nextInt();
        System.out.println(a);
        String name = input.next();

    }
}
