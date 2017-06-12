package com.线程;

/**
 * 线程的启动与基本方法
 *
 * @author Administrator
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("mt");
        MyThread mt1 = new MyThread("mt1");
        // 线程启动不用run方法,要用start方法，一般不用stop方法
//		mt.start();
//		mt1.start();
        System.out.println(mt.isAlive());
        System.out.println(mt1.getName());
    }
}
