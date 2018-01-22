package com.feng.chapter3.demo7;

/**
 * @author jinx
 * @date 2018/1/22 22:01
 * Desc:
 */
public class NotifyThread extends Thread {
    private Object object;

    public NotifyThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            object.notify();
        }
    }
}
