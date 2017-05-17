package com.泛型;

/**
 * 3、Java面向对象之泛型－指定多个泛型
 * Created by HongWeiPC on 2017/5/17.
 */
class ConstructorT1<K, T> {
    private K value1;
    private T value2;

    public ConstructorT1(K value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getValue1() {
        return value1;
    }

    public void setValue1(K value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}

public class Constructor2 {
    public static void main(String[] args) {
        ConstructorT1<String, Integer> c = new ConstructorT1("2", 3.5);
        System.out.println(c.getValue1() + " " + c.getValue2());

    }
}
