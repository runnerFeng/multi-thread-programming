package com.feng.chapter2.demo10;

/**
 * @author jinx
 * @date 2018/1/4 16:45
 * Desc:
 */
public class ThreadA extends Thread{
    ObjectService service ;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodA();
    }
}
