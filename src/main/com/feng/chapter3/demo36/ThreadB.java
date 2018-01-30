package com.feng.chapter3.demo36;

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

    public ThreadB() {
        myService.awaitB();
    }
}
