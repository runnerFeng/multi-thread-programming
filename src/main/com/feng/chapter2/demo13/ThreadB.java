package com.feng.chapter2.demo13;

/**
 * @author jinx
 * @date 2018/1/4 22:46
 * Desc:
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
}
