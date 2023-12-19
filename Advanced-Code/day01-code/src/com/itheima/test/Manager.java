package com.itheima.test;

public class Manager extends Employee {
    private int bonus;

    public void work() {
        System.out.println("姓名为" + super.getName() + "，年龄为" + super.getAge() + "，工资为" + getSalary() + ",奖金为" + bonus + "的项目经理正在分配任务");
    }

    public Manager() {
    }


    public Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
