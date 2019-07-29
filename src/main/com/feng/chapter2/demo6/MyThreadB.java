package com.feng.chapter2.demo6;

/**
 * @author jinx
 * @date 2018/06/07 22:26
 * Desc:
 */
public class MyThreadB extends Thread {

    private Service1 service1;

    public MyThreadB(Service1 service1) {
        this.service1 = service1;
    }

    @Override
    public void run() {
        try {
            service1.methodA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
