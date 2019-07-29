package com.feng.chapter2.demo25;

/**
 * @author jinx
 * @date 2018/1/11 23:47
 * Desc:
 */
public class ThreadA extends Thread {
    private Service service;
    private UserInfo userInfo;

    public ThreadA(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.testMethod(userInfo);
    }
}
