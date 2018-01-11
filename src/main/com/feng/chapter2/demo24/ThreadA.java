package com.feng.chapter2.demo24;

/**
 * @author jinx
 * @date 2018/1/11 21:40
 * Desc:
 */
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
