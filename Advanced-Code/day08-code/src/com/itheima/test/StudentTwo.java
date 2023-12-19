package com.itheima.test;
public class StudentTwo {
    private String name;
    private int age;

    // 数学成绩
    private int MathScore;

    //语文成绩
    private int ChineseLanguageAchievement;

    //英语成绩
    private int EnglishAchievement;

    public StudentTwo() {
    }

    public StudentTwo(String name, int age, int MathScore, int ChineseLanguageAchievement, int EnglishAchievement) {
        this.name = name;
        this.age = age;
        this.MathScore = MathScore;
        this.ChineseLanguageAchievement = ChineseLanguageAchievement;
        this.EnglishAchievement = EnglishAchievement;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) throws StudentOneException {

        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            throw new StudentOneException("输入的年龄应该是0~120之间，请您重写输入");
        }
    }

    /**
     * 获取
     *
     * @return MathScore
     */
    public int getMathScore() {
        return MathScore;
    }

    /**
     * 设置
     *
     * @param MathScore
     */
    public void setMathScore(int MathScore) throws StudentOneException {
        if (MathScore > 0 && MathScore < 100) {
            this.MathScore = MathScore;
        } else {
            throw new StudentOneException("成绩不能为负数，不能大于100分");
        }
    }

    /**
     * 获取
     *
     * @return ChineseLanguageAchievement
     */
    public int getChineseLanguageAchievement() {
        return ChineseLanguageAchievement;
    }

    /**
     * 设置
     *
     * @param ChineseLanguageAchievement
     */
    public void setChineseLanguageAchievement(int ChineseLanguageAchievement) throws StudentOneException {
        if (ChineseLanguageAchievement > 0 && ChineseLanguageAchievement < 100) {
            this.ChineseLanguageAchievement = ChineseLanguageAchievement;
        } else {
            throw new StudentOneException("成绩不能为负数，不能大于100分");
        }
    }

    /**
     * 获取
     *
     * @return EnglishAchievement
     */
    public int getEnglishAchievement() {
        return EnglishAchievement;
    }

    /**
     * 设置
     *
     * @param EnglishAchievement
     */
    public void setEnglishAchievement(int EnglishAchievement) throws StudentOneException {

        if (ChineseLanguageAchievement > 0 && ChineseLanguageAchievement < 100) {
            this.EnglishAchievement = EnglishAchievement;
        } else {
            throw new StudentOneException("成绩不能为负数，不能大于100分");
        }
    }

    public String toString() {
        return " {姓名 = " + name + ", 年龄 = " + age + ", 数学成绩 = " + MathScore + ", 语文成绩 = " + ChineseLanguageAchievement + ", 英语成绩 = " + EnglishAchievement + "}";
    }
}
