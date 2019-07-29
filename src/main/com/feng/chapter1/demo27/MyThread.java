package com.feng.chapter1.demo27;

/**
 * @author jinx
 * @date 2018/1/3 10:59
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
}
