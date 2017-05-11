package com.a4_09.Teacher1;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class Teacher1 {
    private String name; //姓名；
    private int age;

    //返回姓名
    public String getName() {
        return name;
    }

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }

    //返回年龄
    public int getAge() {
        return age;
    }

    //设置年龄
    public void setAge(int age) {
        if (age < 22) {
            System.out.println("输入错误");
            this.age = 22;
        } else
            this.age = age;
    }

    public String introduction() {
        return "大家好！我是" + name + "，我今年" + age + "岁";
    }
}
