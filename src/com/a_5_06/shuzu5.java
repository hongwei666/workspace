package com.a_5_06;

import java.util.Arrays;

/**
 * Created by HongWeiPC on 2017/5/10.
 * *现在给出两个数组：
 * 数组A：“1，7，9，11，13，15，17，19”
 * 数组b：“2，4，6，8，10”
 * 两个数组合并为数组c，按升序排列。
 */
public class shuzu5 {
    public static void main(String[] args) {
        int[] a = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else
                c[a.length + i] = b[i];
        }
        a = Arrays.copyOf(a, a.length + b.length);//数组扩容
        System.arraycopy(b, 0, a, a.length, b.length);
/**
 * 循环遍历
 */
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i];
//        }
//        for (int i = 0; i < b.length; i++) {
//            c[a.length+i] = b[i];
//        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}