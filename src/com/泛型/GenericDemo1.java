package com.泛型;

/**
 * 5、Java面向对象之泛型－泛型接口
 * Created by HongWeiPC on 2017/5/17.
 */
interface GeneInter<T> {
    public void say();
}

class Gin implements GeneInter<String> {
    private String info;

    public Gin(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void say() {
        System.out.println(info);
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        Gin g = new Gin("helloworld");
        g.say();
    }
}
