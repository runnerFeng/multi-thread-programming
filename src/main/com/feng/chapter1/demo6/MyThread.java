package com.feng.chapter1.demo6;

/**
 * @author jinx
 * @date 2017/12/25 22:48
 * Desc:
 */
public class MyThread extends Thread {
    private int count =5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由"+Thread.currentThread().getName()+"计算，count="+count);
    }
}
