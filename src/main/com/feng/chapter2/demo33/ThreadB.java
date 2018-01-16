package com.feng.chapter2.demo33;

/**
 * @author jinx
 * @date 2018/1/16 21:00
 * Desc:
 */
public class ThreadB extends Thread {
    private Service service = new Service();

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stop();
    }
}
