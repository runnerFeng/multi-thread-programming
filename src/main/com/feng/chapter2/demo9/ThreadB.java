package com.feng.chapter2.demo9;

/**
 * @author jinx
 * @date 2018/1/4 15:09
 * Desc:
 */
public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
