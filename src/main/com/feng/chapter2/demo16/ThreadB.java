package com.feng.chapter2.demo16;

/**
 * @author jinx
 * @date 2018/1/8 21:51
 * Desc:
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        Service.print(new Object());
    }
}
