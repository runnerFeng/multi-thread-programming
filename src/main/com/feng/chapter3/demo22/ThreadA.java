package com.feng.chapter3.demo22;

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
                //sleep()不释放锁
                Thread.sleep(6000);
//                threadB.join(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
