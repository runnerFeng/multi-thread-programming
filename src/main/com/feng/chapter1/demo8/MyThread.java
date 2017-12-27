package com.feng.chapter1.demo8;

/**
 * @author jinx
 * @date 2017/12/27 22:48
 * Desc:
 */
public class MyThread extends Thread {
    private int i = 5;
    @Override
    public void run() {
        super.run();
        System.out.println("i="+(i--)+" threadName="+Thread.currentThread().getName());
    }
}
