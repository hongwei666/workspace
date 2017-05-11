package com.a_5_06;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by HongWeiPC on 2017/5/10.
 * 1.随机一个10数组
 * 2.使用冒泡排序升序
 * 3.控制台输入一个值
 * 判断值是否在数组中
 * 如果在 输出索引
 * 如果不再 输出没有找到
 */
public class shuzu {
    public static void main(String[] args) {
        int[] shuzu = new int[10];
        Random random = new Random();
        for (int i = 0; i < shuzu.length; i++) {
            shuzu[i] = random.nextInt(10 + 1);
        }
        for (int i = 0; i < shuzu.length - 1; i++) {
            for (int j = 0; j < shuzu.length - 1 - i; j++) {
                if (shuzu[j] > shuzu[j + 1]) {
                    int temp = shuzu[j];
                    shuzu[j] = shuzu[j + 1];
                    shuzu[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < shuzu.length; i++) {
            System.out.println(shuzu[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int flag = 0;
        for (int i = 0; i < shuzu.length; i++) {
            if (a == shuzu[i]) {
                flag = 1;
                if (flag == 1)
                    System.out.println("索引是：" + i);
            } else
                flag = 0;
        }
        if (flag != 1)
            System.out.println("没有找到");
    }
}
