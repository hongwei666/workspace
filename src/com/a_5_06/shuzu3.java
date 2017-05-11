package com.a_5_06;

/**
 * Created by HongWeiPC on 2017/5/10.
 * 定义一个包含10个元素的数组，对其进行赋值，使每个元素的值等于其下标，
 * 然后输出，最后将数组倒置后输出
 */
public class shuzu3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = a.length - 1; i > 0; i--) {
            System.out.println(a[i]);
        }
    }
}
