package com.feng.chapter2.demo18;

/**
 * @author jinx
 * @date 2018/1/8 22:24
 * Desc:
 */
public class ThreadB extends Thread {
    private Service service = new Service();

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
