package com.feng.chapter2.demo17;

/**
 * @author jinx
 * @date 2018/1/8 22:24
 * Desc:
 */
public class ThreadA extends Thread {
    private Service service = new Service();

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
