package com.feng.chapter2.demo8;

/**
 * @author jinx
 * @date 2018/1/4 15:09
 * Desc:
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
