package com.feng.chapter3.demo10;

/**
 * @author jinx
 * @date 2018/1/22 23:37
 * Desc:
 */
public class ThreadA extends Thread {
    private Add add;

    public ThreadA(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
