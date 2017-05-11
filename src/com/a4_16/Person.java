package com.a4_16;

/**
 * Created by HongWeiPC on 2017/5/2.
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "没有姓名";
        this.age = 0;
    }

    public Person(String name1, int age2) {
        this.name = name1;
        this.age = age2;
    }

    public void display() {
        System.out.println("姓名：" + name + "\n年龄：" + age);
    }

}

class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("李书豪", 20);
        p1.display();
        p2.display();
    }
}
