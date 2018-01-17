package com.feng.chapter3.demo4;

/**
 * @author jinx
 * @date 2018/1/16 21:52
 * Desc:等待/通信机制;需要注意notify()执行后,并不立即释放锁;每个线程都有两个队列，一个就绪队列，一个阻塞队列。
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();

        ThreadB threadB = new ThreadB(object);
        threadB.start();
        Thread.sleep(50);
        ThreadA threadA = new ThreadA(object);
        threadA.start();
    }
}
