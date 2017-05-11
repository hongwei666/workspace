package com.a_5_06;

import java.util.Random;

/**
 * Created by HongWeiPC on 2017/5/10.
 * 定义一个由整数组成的数组，要求求出其中的奇数个数和偶数个数。
 */
public class shuzu2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int ji = 0;
        int ou = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1)
                ji++;
            else
                ou++;
        }
        System.out.println("偶数:" + ou);
        System.out.println("奇数" + ji);
    }
}
