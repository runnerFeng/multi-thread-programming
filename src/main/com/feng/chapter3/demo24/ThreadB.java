package com.feng.chapter3.demo24;

/**
 * @author jinx
 * @date 2018/1/30 14:13
 * Desc:
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        try {
            System.out.println("threadB begin:" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("threadB end:  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
