package com.a_5_11;

import java.util.Arrays;

/**
 * 显示质数合数方法 flag,常用
 * Created by HongWeiPC on 2017/5/11.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = Util.getRandomIntArray(10, 1, 101);
        System.out.println(Arrays.toString(arr));
        int countZhi = 0, countHe = 0;
        int j = 0;
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    countHe++;
                    flag = false;
                    break;
                }

            }
            if (flag)
                countZhi++;
        }
        System.out.println("质数：" + countZhi);
        System.out.println("合数：" + countHe);
    }
}
