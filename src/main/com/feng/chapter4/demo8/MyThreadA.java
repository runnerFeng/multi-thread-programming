package com.feng.chapter4.demo8;

/**
 * @author jinx
 * @date 2018/02/05 21:48
 * Desc:
 */
public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
