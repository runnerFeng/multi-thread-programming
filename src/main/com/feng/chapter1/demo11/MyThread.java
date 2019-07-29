package com.feng.chapter1.demo11;

/**
 * @author jinx
 * @date 2017/12/29 14:49
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run:" + this.isAlive());
    }
}
