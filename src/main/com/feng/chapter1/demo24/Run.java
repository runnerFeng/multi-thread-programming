package com.feng.chapter1.demo24;

/**
 * @author jinx
 * @date 2018/1/2 22:45
 * Desc:结合interrupt和return停止线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
