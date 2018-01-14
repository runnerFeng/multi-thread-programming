package com.feng.chapter2.demo30;

/**
 * @author jinx
 * @date 2018/1/14 21:54
 * Desc:
 */
public class MyThread extends Thread {
//    volatile public static int count;
    public static int count;

    /**
     * 因为该方法为static方法，所以该锁为类锁
     */
    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("threadName:" + Thread.currentThread().getName() + " count:" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
