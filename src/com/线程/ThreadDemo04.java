package com.线程;

/**
 * 线程的join
 *
 * @author Administrator
 */

class RunnableDemo04 implements Runnable {
    private String name;

    RunnableDemo04(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(name + ":" + i);
        }
    }
}

public class ThreadDemo04 {

    public static void main(String[] args) {
        RunnableDemo04 r1 = new RunnableDemo04("A");
        Thread t1 = new Thread(r1);
        t1.start();
        for (int i = 0; i < 50; i++) {
            if (i == 10) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程" + i);
        }
    }
}
