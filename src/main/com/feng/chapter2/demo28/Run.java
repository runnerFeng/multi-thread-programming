package com.feng.chapter2.demo28;

/**
 * @author jinx
 * @date 2018/1/14 14:41
 * Desc:多线程异步死循环问题：volatile关键字解决私有私有堆栈和公有堆栈中值不一致的问题。
 *      1.volatile能保证数据的可见性，但不能保证数据的原子性；而synchronized可以保证数据的原子性，间接保证数据的可见性。
 *      2.volatile解决的是变量在多个线程之间的可见性，而synchronized解决的是多个线程之间访问资源的同步性。
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        Thread.sleep(1000);
        runThread.setRunning(false);
        System.out.println("赋值为false了");
    }
}
