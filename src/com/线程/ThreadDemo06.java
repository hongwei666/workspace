package com.线程;


/**
 * 线程同步
 *
 * @author Administrator
 */
class MyThreadDemo implements Runnable {
    private int ticket = 100;

    public void run() {
        while (ticket > 0) {
            sell();
            // synchronized (this) {
            // System.out.println(Thread.currentThread().getName() + "1张车票：" +
            // "车票还剩"+((ticket--)-1)+"张");
            // }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void sell() {
        synchronized (this) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "1张车票：" + "车票还剩" + ((ticket--) - 1) + "张");
            }
        }
    }
}

public class ThreadDemo06 {

    public static void main(String[] args) {
        MyThreadDemo m = new MyThreadDemo();
        Thread t1 = new Thread(m, "窗口1出售");
        Thread t2 = new Thread(m, "窗口2出售");
        Thread t3 = new Thread(m, "窗口3出售");
        t2.start();
        t1.start();
        t3.start();
    }
}
