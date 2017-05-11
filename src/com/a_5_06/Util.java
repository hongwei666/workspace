package com.a_5_06;

/**
 * Created by HongWeiPC on 2017/5/12.
 */
public class Util {
    //交换数组中俩个元素的值
    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
