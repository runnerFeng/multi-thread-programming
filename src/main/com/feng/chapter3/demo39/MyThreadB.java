package com.feng.chapter3.demo39;

/**
 * @author jinx
 * @date 2018/02/05 21:50
 * Desc:
 */
public class MyThreadB extends Thread {
    private MyService myService;

    public MyThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }
}
