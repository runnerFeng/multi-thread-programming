package com.feng.chapter3.demo23;

/**
 * @author jinx
 * @date 2018/1/30 10:35
 * Desc:
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("threadB begin:" + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("threadB end:  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("bServiceBegin:" + System.currentTimeMillis());
    }
}
