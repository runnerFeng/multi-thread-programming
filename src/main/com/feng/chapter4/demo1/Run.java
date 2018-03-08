package com.feng.chapter4.demo1;

/**
 * @author jinx
 * @date 2018/1/30 16:49
 * Desc:ReentrantLock实现同步测试1
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        myThread.start();
        myThread2.start();
        myThread3.start();
    }
}
