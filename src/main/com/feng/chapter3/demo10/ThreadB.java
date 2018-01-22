package com.feng.chapter3.demo10;

/**
 * @author jinx
 * @date 2018/1/22 23:38
 * Desc:
 */
public class ThreadB extends Thread {
    private Subtract subtract;

    public ThreadB(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
