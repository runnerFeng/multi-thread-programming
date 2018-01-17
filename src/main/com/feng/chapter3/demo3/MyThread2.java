package com.feng.chapter3.demo3;

/**
 * @author jinx
 * @date 2018/1/17 21:52
 * Desc:
 */
public class MyThread2 extends Thread {
    private Object object;

    public MyThread2(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            System.out.println("before run notify():" + System.currentTimeMillis());
            object.notify();
            System.out.println("after run notify():" + System.currentTimeMillis());
        }
    }
}
