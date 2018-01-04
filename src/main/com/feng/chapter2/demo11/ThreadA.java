package com.feng.chapter2.demo11;

/**
 * @author jinx
 * @date 2018/1/4 21:23
 * Desc:
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameAndPassword("a","aa");
    }
}
