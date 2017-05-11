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
        //使用一个循环扩容数组
//        for (int i = 0; i < c.length; i++) {
//            if (i < a.length) {
//                c[i] = a[i];
//            }
//            else
//                c[i]=b[i-a.length];
//        }
        //使用Arrays类扩容数组，有问题,已经修复于5.12晚上0.50
        c = Arrays.copyOf(a, a.length + b.length);//数组扩容
        System.arraycopy(b, 0, c, a.length, b.length);
        //循环遍历扩容数组
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i];
//        }
//        for (int i = 0; i < b.length; i++) {
//            c[a.length+i] = b[i];
//        }

        //遍历输出数组
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
        Util.compare(c);
        System.out.println(Arrays.toString(c));
    }
}