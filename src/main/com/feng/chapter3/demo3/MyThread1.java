package com.feng.chapter3.demo3;

/**
 * @author jinx
 * @date 2018/1/17 21:49
 * Desc:
 */
public class MyThread1 extends Thread {
    private Object object;

    public MyThread1(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            try {
                System.out.println("before run wait():" + System.currentTimeMillis());
                object.wait();
                System.out.println("after run wait():" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
