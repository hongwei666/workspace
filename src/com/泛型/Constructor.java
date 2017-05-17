package com.泛型;

/**
 * 构造函数中使用泛型
 *
 * @param <T>
 */
class ConstructorT<T> {
    private T value;

    public ConstructorT(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class Constructor {
    public static void main(String[] args) {
        ConstructorT<String> c = new ConstructorT<>("构造函数使用泛型");
        System.out.println(c.getValue());
    }
}