package com.线程;

public class RunnableDemo01 {
    public static void main(String[] args) {
        MyRunnable m1 = new MyRunnable("任务1");
        MyRunnable m2 = new MyRunnable("任务2");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
