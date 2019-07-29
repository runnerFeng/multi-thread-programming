package com.feng.chapter2.demo33;

/**
 * @author jinx
 * @date 2018/1/16 20:58
 * Desc:
 */
public class ThreadA extends Thread {
    private Service service = new Service();

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
