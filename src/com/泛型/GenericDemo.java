package com.泛型;

/**
 * 4、Java面向对象之泛型－通配符
 * Created by HongWeiPC on 2017/5/17.
 */
class Info<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public String toString() {
        return this.getKey().toString();
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Info<String> i = new Info<>();
        i.setKey("hello");
        tell(i);
    }

    /**
     * 通配符
     *
     * @param i
     */
    public static void tell(Info<String> i) {
        System.out.println(i);
    }
}
