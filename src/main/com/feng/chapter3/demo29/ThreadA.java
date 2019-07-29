package com.feng.chapter3.demo29;

/**
 * @author jinx
 * @date 2018/1/30 16:08
 * Desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("在threadA线程中取值：" + Tools.t.get());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
