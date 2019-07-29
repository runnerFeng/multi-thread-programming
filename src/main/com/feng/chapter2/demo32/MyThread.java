package com.feng.chapter2.demo32;

/**
 * @author jinx
 * @date 2018/1/14 22:55
 * Desc:
 */
public class MyThread extends Thread {
    private MyService service = new MyService();

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.addNum();
    }
}
