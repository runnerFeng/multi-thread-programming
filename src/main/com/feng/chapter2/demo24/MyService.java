package com.feng.chapter2.demo24;

/**
 * @author jinx
 * @date 2018/1/10 21:11
 * Desc:
 */
public class MyService {
    private String lock = "123";

    public void testMethod() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " start");
            try {
                lock = "456";
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }
    }
}
