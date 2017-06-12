package com.线程;

/**
 * 线程的礼让
 *
 * @author Administrator
 */

class RunnableDemo implements Runnable {
    private String name;

    RunnableDemo(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ":" + i);
            if (i == 5) {
                System.out.println("礼让");
                Thread.yield();
            }
        }
    }
}

public class ThreadDemo03 {

    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("A");
        RunnableDemo r2 = new RunnableDemo("B");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
