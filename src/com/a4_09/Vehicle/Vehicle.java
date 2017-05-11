package com.a4_09.Vehicle;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class Vehicle {
    private int speed = 50;
    private int size = 50;

    public void move() {
        System.out.println("开始移动");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void speedUp() {
        this.speed += 10;
        System.out.println("加速");
    }

    public void speedDown() {
        this.speed -= 10;
        System.out.println("减速");
    }

    @Override
    public String toString() {
        return "当前速度是：" + speed + "\t重量是:" + size;
    }
}
