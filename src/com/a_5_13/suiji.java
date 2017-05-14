package com.a_5_13;

import java.util.Scanner;

/**
 * Created by HongWeiPC on 2017/5/13.
 * 2.给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成｛‘a’,’b’｝
 */
public class suiji {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int shuru = scanner.nextInt();
        char[] s = new char[shuru];
        for (int i = 0; i < shuru; i++) {
            int a = (int) (Math.random() * 3);
            if (a == 0) {
                s[i] = (char) (Math.random() * 10 + 48);
            } else if (a == 1) {
                s[i] = (char) (Math.random() * 26 + 65);
            } else {
                s[i] = (char) (Math.random() * 26 + 97);
            }
        }
        System.out.println(s);
/**
 *方法二用Random
 */
//        Scanner scanner = new Scanner(System.in);
//        int zs = scanner.nextInt();
//        Random random = new Random();
//        char[] sz = new char[zs];
//        for (int i = 0; i < zs; i++) {
//            int b = random.nextInt(3);
//            if (b == 0) {
//                sz[i] = (char) (random.nextInt(10) + 48);
//            } else if (b == 1) {
//                sz[i] = (char) (random.nextInt(26) + 65);
//            } else if (b == 2) {
//                sz[i] = (char) (random.nextInt(26) + 97);
//            }
//        }
//        System.out.println(sz);
    }
}
