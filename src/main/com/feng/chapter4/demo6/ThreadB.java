package com.feng.chapter4.demo6;

/**
 * @author jinx
 * @date 2018/1/30 18:06
 * Desc:
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
