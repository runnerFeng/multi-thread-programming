package com.feng.chapter2.demo11;

/**
 * @author jinx
 * @date 2018/1/4 21:24
 * Desc:
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameAndPassword("b","bb");
    }

}
