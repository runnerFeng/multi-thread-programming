package com.feng.chapter3.demo5;

/**
 * @author jinx
 * @date 2018/1/18 21:09
 * Desc:
 */
public class ThreadA extends Thread {
    private Object object;

    public ThreadA(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(object);
    }
}
