package com.a_5_06;

/**
 * Created by HongWeiPC on 2017/5/10.
 * 定义一个包含10个元素的数组，对其进行赋值，使每个元素的值等于其下标，
 * 然后输出，最后将数组  先倒置后输出
 */
public class shuzu3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        //遍历输出数组
        System.out.println("没有倒置：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //倒置数组
        for (int i = 0; i < a.length / 2; i++) {
            Util.swap(a, i, a.length - 1 - i);
        }
        System.out.println("倒置后：");
        //遍历输出数组
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
