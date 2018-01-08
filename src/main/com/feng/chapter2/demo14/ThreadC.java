package com.feng.chapter2.demo14;

/**
 * @author jinx
 * @date 2018/1/4 23:02
 * Desc:对象锁
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
