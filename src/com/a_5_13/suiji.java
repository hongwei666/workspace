package com.a_5_13;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by HongWeiPC on 2017/5/13.
 * 2.给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成｛‘a’,’b’｝
 */
public class suiji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zs = scanner.nextInt();
        Random random = new Random();
        char[] sz = new char[zs];
        for (int i = 0; i < zs; i++) {
            int b = random.nextInt(3);
            if (b == 0) {
                sz[i] = (char) (random.nextInt(10) + 48);
            } else if (b == 1) {
                sz[i] = (char) (random.nextInt(26) + 65);
            } else if (b == 2) {
                sz[i] = (char) (random.nextInt(26) + 97);
            }
        }
        System.out.println(sz);
    }
}
