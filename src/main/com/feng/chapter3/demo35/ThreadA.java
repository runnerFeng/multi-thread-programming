package com.feng.chapter3.demo35;

/**
 * @author jinx
 * @date 2018/1/30 17:15
 * Desc:
 */
public class ThreadA extends Thread {
    private MyService myService;

    @Override
    public void run() {
        myService.await();
    }

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

}

