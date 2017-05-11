package com.a_5_11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by HongWeiPC on 2017/5/11.
 * 0.List实现
 * 1.随机一个10数组
 * 2.使用冒泡排序升序
 * 3.控制台输入一个值
 * 判断值是否在数组中
 * 如果在 输出索引
 * 如果不再 输出没有找到
 */
public class ListDemo {
    public static void main(String[] args) {
        final int length = 10; //数组的总长度
        ArrayList lists = new ArrayList(length);
        Random random = new Random();
        /**产生10个随机数*/
        for (int i = 0; i < length; i++) {
            int b = random.nextInt(10) + 1;
            lists.add(i, b);
        }
        /**输入一个数字*/
        Scanner scanner = new Scanner(System.in);
        Integer shuru = scanner.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            if (shuru == lists.get(i))
                System.out.println(lists.indexOf("shuru"));
        }
        /**遍历输出*/
        System.out.println("遍历输出结果");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        System.out.println("判断为空");
        System.out.println(lists.isEmpty());
    }
}
