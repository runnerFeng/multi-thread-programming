package com.feng.chapter3.demo3;

/**
 * @author jinx
 * @date 2018/1/17 21:54
 * Desc:notify()方法唤醒wait()状态的线程，让其继续执行。
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object object = new Object();
            MyThread1 thread1 = new MyThread1(object);
            thread1.start();
            Thread.sleep(3000);
            MyThread2 thread2 = new MyThread2(object);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
