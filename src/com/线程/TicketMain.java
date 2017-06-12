package com.线程;


public class TicketMain implements Runnable {
    private final Object mutex = new Object();// 锁，自己定义的，或者使用实例的锁
    private int ticketCount = 10;// 总的票数，这个是共享资源，多个线程都会访问

    public static void main(String[] args) {
        TicketMain runTicekt = new TicketMain();// 只定义了一个实例，这就只有一个Object mutex
        // = new Object();即一个锁。
        Thread th1 = new Thread(runTicekt, "窗口1");// 每个线程等其他线程释放该锁后，才能执行
        Thread th2 = new Thread(runTicekt, "窗口2");
        Thread th3 = new Thread(runTicekt, "窗口3");
        Thread th4 = new Thread(runTicekt, "窗口4");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }

    /**
     * 卖票
     */
    private void sellTicket() {
        synchronized (mutex)// 当操作的是共享数据时,
        // 用同步代码块进行包围起来,执行里面的代码需要mutex的锁，但是mutex只有一个锁。这样在执行时,只能有一个线程执行同步代码块里面的内容
        {
            if (ticketCount > 0) {
                ticketCount--;
                System.out.println(Thread.currentThread().getName() + "正在卖票,还剩" + ticketCount + "张票");
            } else {
                System.out.println("票已经卖完！");
            }
        }
    }

    public void run() {
        while (ticketCount > 0)// 循环是指线程不停的去卖票
        {
            sellTicket();
            /**
             * 在同步代码块里面睡觉,和不睡效果是一样
             * 的,作用只是自已不执行,也不让线程执行。sleep不释放锁，抱着锁睡觉。其他线程拿不到锁，也不能执行同步代码。wait()可以释放锁
             * 所以把睡觉放到同步代码块的外面,这样卖完一张票就睡一会,让其他线程再卖,这样所有的线程都可以卖票
             */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}








