package com.feng.chapter1.demo32;

/**
 * @author jinx
 * @date 2018/1/3 16:26
 * Desc:
 */
public class ThreadA extends Thread {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
