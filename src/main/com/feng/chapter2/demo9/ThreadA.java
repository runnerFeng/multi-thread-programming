package com.feng.chapter2.demo9;


/**
 * @author jinx
 * @date 2018/1/4 15:09
 * Desc:
 */
public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
