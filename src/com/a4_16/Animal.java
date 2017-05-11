package com.a4_16;

/**
 * Created by HongWeiPC on 2017/5/2.
 */
public class Animal {
    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Rabbit extends Animal {
    public void eat() {
        super.eat();
        System.out.println("吃草");
    }
}

class Tiger extends Animal {
    public void eat() {
        super.eat();
        System.out.println("吃肉");
    }
}

class TestAnimal {
    public static void showEat(Rabbit a) {
        a.eat();
    }

    public static void showEat(Tiger t) {
        t.eat();
    }

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        showEat(rabbit);
        rabbit.sleep();
        showEat(tiger);
        tiger.sleep();
    }
}


