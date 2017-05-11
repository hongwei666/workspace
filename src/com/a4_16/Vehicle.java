package com.a4_16;

/**
 * Created by HongWeiPC on 2017/5/2.
 */
public interface Vehicle {
    public void NoOfWheels();
}

class Car implements Vehicle {
    public void NoOfWheels() {
        System.out.println("四轮车");
    }
}

class Motorbike implements Vehicle {
    public void NoOfWheels() {
        System.out.println("双轮车");
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike();
        car.NoOfWheels();
        motorbike.NoOfWheels();
    }
}
