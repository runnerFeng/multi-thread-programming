package com.feng.chapter1.demo25;

/**
 * @author jinx
 * @date 2018/1/2 23:16
 * Desc:
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}
