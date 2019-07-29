package com.feng.chapter1.demo3;

/**
 * @author jinx
 * @date 2017/12/25 22:06
 * Desc:
 */
public class MyThread extends Thread {
    private int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
