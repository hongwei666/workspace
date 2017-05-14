package com.a_5_13;

import java.util.Arrays;

/**
 * Created by HongWeiPC on 2017/5/13.
 * 3.给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计出每个数字出现的次数
 */
public class tongji {
    public static void main(String[] args) {
        String s = "1239586838923173478943890234092";
        int[] c = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int b = a - 48;
            c[b]++;
        }
        System.out.println(Arrays.toString(c));
    }
}
