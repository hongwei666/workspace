package com.a4_09.A;

import java.util.Scanner;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class TestA {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("请输入你猜测的数字");
        while (true) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x > a.getV()) {
                System.out.println("您猜的数字是" + x + ",它大了\n请重新输入");
            } else if (x == a.getV()) {
                System.out.println("恭喜你，猜对了");
                break;
            } else {
                System.out.println("您猜的数字是" + x + ",它小了\n请重新输入");
            }
        }
    }
}
