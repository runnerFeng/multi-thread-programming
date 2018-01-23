package com.feng.chapter3.demo11;

/**
 * @author jinx
 * @date 2018/1/23 21:50
 * Desc:
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
