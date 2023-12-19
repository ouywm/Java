package com.itheima.loop;

import java.util.Scanner;
public class LoopDemo {
    public static void main(String[] args) {

        checkPasswords();
    }
    /*
        循环语句可以解决的问题:
     */
    public static void checkPasswords(){
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入密码:");

            int password = input.nextInt();

            if(password == 123456){
                System.out.println("密码正确");
                break;

            }else {
                System.out.println("密码错误");
            }
        }


    }
}
