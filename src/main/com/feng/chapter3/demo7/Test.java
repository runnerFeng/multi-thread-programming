package com.feng.chapter3.demo7;

/**
 * @author jinx
 * @date 2018/1/22 22:02
 * Desc:notify方法每次只随机释放一个锁，notifyAll则一次唤醒所有的线程
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        ThreadA threadA = new ThreadA(object);
        threadA.start();
        ThreadB threadB = new ThreadB(object);
        threadB.start();
        ThreadC threadC = new ThreadC(object);
        threadC.start();
        Thread.sleep(2000);
        NotifyThread thread = new NotifyThread(object);
        thread.run();
    }
}
