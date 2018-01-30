package com.feng.chapter3.demo32;

/**
 * @author jinx
 * @date 2018/1/30 16:58
 * Desc:
 */
public class ThreadAA extends Thread {
    private MyService myService;

    public ThreadAA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
