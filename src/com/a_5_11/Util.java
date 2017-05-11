package com.a_5_11;

/**
 * Created by HongWeiPC on 2017/5/11.
 */

import java.util.Random;

/**
 * 生成指定大小，范围的随机数组
 */
public class Util {
    public static int[] getRandomIntArray(int length, int start, int end) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(end - start) + start;
        }
        return arr;
    }

}
