package com.feng.chapter3.demo23;

/**
 * @author jinx
 * @date 2018/1/30 10:42
 * Desc:
 */
public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
