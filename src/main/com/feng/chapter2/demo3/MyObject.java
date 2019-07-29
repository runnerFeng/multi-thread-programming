package com.feng.chapter2.demo3;

/**
 * @author jinx
 * @date 2018/1/4 10:29
 * Desc:
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end methodA threadName:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
