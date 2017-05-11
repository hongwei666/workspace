package com.a4_09.music;

/**
 * Created by HongWeiPC on 2017/4/11.
 */
public class TestMusic {
    public static void main(String[] args) {
        Music m = new Music();
        m.style = "流行";
        m.author = "Jay";
        m.time = "4:05";
        System.out.println(m.tostring());
    }
}
