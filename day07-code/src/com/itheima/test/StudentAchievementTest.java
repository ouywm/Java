package com.itheima.test;

public class StudentAchievementTest {
    public static void main(String[] args) {

        StudentAchievement stu1 = new StudentAchievement
                (1, "张三", 23, 90.0, 87.0);

        StudentAchievement stu2 = new StudentAchievement
                (2, "李四", 24, 69.0, 91.0);


        stu1.showStudentInfos();
        double totalScore = stu1.getTotalScore();
        System.out.println(stu1.name + "同学的语文数学总成绩为：" + totalScore);
        System.out.println("\n************************************************\n");;
        stu2.showStudentInfos();
        double totalScore1 = stu2.getTotalScore();
        System.out.println(stu2.name + "同学的语文数学总成绩为：" + totalScore1);
    }
}
