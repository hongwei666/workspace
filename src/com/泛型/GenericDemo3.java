package com.泛型;

/**
 * 7、Java面向对象之泛型－泛型数组
 * Created by HongWeiPC on 2017/5/17.
 */
public class GenericDemo3 {
    public static void main(String[] args) {
        String arr[] = {"hello", "2", "4"};
        tell(arr);
    }

    private static <T> void tell(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
