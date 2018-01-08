package com.feng.chapter2.demo15;

/**
 * @author jinx
 * @date 2018/1/8 21:51
 * Desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.print("AA");
    }
}
