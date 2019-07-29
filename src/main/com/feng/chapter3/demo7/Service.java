package com.feng.chapter3.demo7;

/**
 * @author jinx
 * @date 2018/1/22 21:24
 * Desc:
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin wait");
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " end wait");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为wait状态的线程被interrupt");
        }
    }
}
