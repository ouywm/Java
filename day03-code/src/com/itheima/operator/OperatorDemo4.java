package com.itheima.operator;

public class OperatorDemo4 {
    /*
        逻辑运算符:
            1.用于连接boolean类型的表达式,或者是值
            2.整合多个条件,位一段整体的逻辑
        分类:
            &(与) :  并且的含义,遇到false就是false

                场景:范围性的判断查找
                举例:键盘录入一个学生的成绩,判断该成绩是否90~100之间
                伪代码不能运行:
                    int score = 95;
                    如果(score >=90 && score <= 100){
                    }
            |(或) :  或者的含义,遇到true就是true
                场景:多个条件任选其一
                举例:键盘录入学生学号,学号 3 5 12
                int ID = 3;
                如果(ID == 3 | ID == 5 || ID == 12){
                }
            !(非) :  取反
                场景:对一段逻辑整体做取反操作
                举例:键盘录入一个学生学号,学号除了3 5 12 都要
                int ID = 3;
                如果(     !    (ID == 3 | ID == 5 || ID == 12)    ){
                }
            ^(异或) : 相同的为false,不同的为true
     */
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println("--------------------");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);
        System.out.println("--------------------");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("--------------------");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
    }
}
