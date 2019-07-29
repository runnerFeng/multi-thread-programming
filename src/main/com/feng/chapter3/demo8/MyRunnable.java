package com.feng.chapter3.demo8;

/**
 * @author jinx
 * @date 2018/1/22 22:13
 * Desc:wait(long)等待一段时间后如果没有被唤醒则自动唤醒
 */
public class MyRunnable {
    private static Object object = new Object();
    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (object) {
                    System.out.println("begin wait");
                    object.wait(5000);
                    System.out.println("end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (object) {
                object.notify();
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(2000);
        Thread thread1 = new Thread(runnable2);
        thread1.start();
    }
}
