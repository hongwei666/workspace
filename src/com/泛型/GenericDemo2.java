package com.泛型;

/**
 * 6、Java面向对象之泛型－泛型方法
 * Created by HongWeiPC on 2017/5/17.
 */
class Gener {
    public <T> T tell(T t) {
        return t;
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        Gener g = new Gener();
        String s = g.tell("helloworld");
        System.out.println(s);
        int a = g.tell(123);
        System.out.println(a);
    }

}
