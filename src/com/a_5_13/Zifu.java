package com.a_5_13;

/**
 * 1.给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置。
 * 如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12。字符串和子串均由用户输入
 * Created by HongWeiPC on 2017/5/13.
 */
public class Zifu {
    public static void main(String[] args) {
        String userInput = "abcbcbabcb34bcbd";
        String subString = "bcb";
        int index = 0;
        while (true) {
            if (userInput.indexOf(subString, index) != -1) {
                System.out.println(userInput.indexOf(subString, index));
                index = userInput.indexOf(subString, index) + subString.length();
            } else
                break;
        }
    }
}

