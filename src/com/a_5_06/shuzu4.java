package com.a_5_06;

/**
 * Created by HongWeiPC on 2017/5/10.
 * *现在给出两个数组：
 * 数组A：“1，7，9，11，13，15，17，19”
 * 数组b：“2，4，6，8，10”
 * 两个数组合并为数组c，按升序排列。
 */
public class shuzu4 {
    public static void main(String[] args) {
        int[] a = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int j = a.length;
        for (int i = 0; i < b.length; i++) {
            c[j] = b[i];
            j++;
        }

        for (int i = 0; i < c.length - 1; i++) {
            for (int k = 0; k < c.length - 1 - i; k++) {
                if (c[k] > c[k + 1]) {
                    int temp = c[k];
                    c[k] = c[k + 1];
                    c[k + 1] = temp;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}