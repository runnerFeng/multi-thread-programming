package com.feng.chapter4.demo1;

/**
 * @author jinx
 * @date 2018/1/30 16:48
 * Desc:
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
