package com.a4_09.Vehicle;

import java.util.Scanner;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("请输入初始速度");
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        System.out.println("请输入初始体积");
        int size = in.nextInt();
        v.setSpeed(speed);
        v.setSize(size);
        v.move();
        System.out.println(v);
        v.speedUp();
        System.out.println(v);
        v.speedDown();
        System.out.println(v);
    }
}
