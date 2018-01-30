package com.feng.chapter3.demo23;

/**
 * @author jinx
 * @date 2018/1/30 10:35
 * Desc:
 */
public class ThreadA extends Thread {
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB) {
                threadB.start();
                //join()释放锁
                threadB.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String s = new String();
                    Math.random();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
