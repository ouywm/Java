package com.itheima.test;

public class StudentAchievement {

    int id;
    String name;
    int age;
    double MathematicsAchievement;
    double ChineseAchievement;

    public StudentAchievement(int id, String name, int age, double MathematicsAchievement, double ChineseAchievement) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.MathematicsAchievement = MathematicsAchievement;
        this.ChineseAchievement = ChineseAchievement;

    }

    public StudentAchievement() {
    }

    public double getTotalScore() {

        return MathematicsAchievement + ChineseAchievement;
    }

    public void showStudentInfos() {

        System.out.println("id为：" + id);
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("数学成绩：" + MathematicsAchievement);
        System.out.println("语文成绩：" + ChineseAchievement);

    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return MathematicsAchievement
     */
    public double getMathematicsAchievement() {
        return MathematicsAchievement;
    }

    /**
     * 设置
     * @param MathematicsAchievement
     */
    public void setMathematicsAchievement(double MathematicsAchievement) {
        this.MathematicsAchievement = MathematicsAchievement;
    }

    /**
     * 获取
     * @return ChineseAchievement
     */
    public double getChineseAchievement() {
        return ChineseAchievement;
    }

    /**
     * 设置
     * @param ChineseAchievement
     */
    public void setChineseAchievement(double ChineseAchievement) {
        this.ChineseAchievement = ChineseAchievement;
    }

    public String toString() {
        return "StudentAchievement{id = " + id + ", name = " + name + ", age = " + age + ", MathematicsAchievement = " + MathematicsAchievement + ", ChineseAchievement = " + ChineseAchievement + "}";
    }
}
