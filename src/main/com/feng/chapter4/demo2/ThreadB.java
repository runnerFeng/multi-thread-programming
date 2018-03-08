package com.feng.chapter4.demo2;

/**
 * @author jinx
 * @date 2018/1/30 16:58
 * Desc:
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
