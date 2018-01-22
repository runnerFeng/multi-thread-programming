package com.feng.chapter3.demo7;

/**
 * @author jinx
 * @date 2018/1/22 21:26
 * Desc:
 */
public class ThreadC extends Thread {
    private Object object;

    public ThreadC(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(object);
    }
}
