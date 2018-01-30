package com.feng.chapter3.demo24;

/**
 * @author jinx
 * @date 2018/1/30 14:12
 * Desc:
 */
public class ThreadA extends Thread {
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        synchronized (threadB) {
            try {
                System.out.println("threadA begin:" + System.currentTimeMillis());
                Thread.sleep(3000);
                System.out.println("threadA end:  " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
