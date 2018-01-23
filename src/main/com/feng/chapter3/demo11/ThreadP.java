package com.feng.chapter3.demo11;

/**
 * @author jinx
 * @date 2018/1/23 21:49
 * Desc:
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
