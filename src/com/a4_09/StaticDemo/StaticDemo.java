package com.a4_09.StaticDemo;

/**
 * Created by HongWeiPC on 2017/4/12.
 */
public class StaticDemo {
    static int a;
    int b;

    public static void main(String[] args) {
        StaticDemo s = new StaticDemo();
        StaticDemo.a = 10;
        s.b = 5;
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "a=" + a + "\tb=" + b;
    }
}
