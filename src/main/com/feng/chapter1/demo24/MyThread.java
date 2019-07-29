package com.feng.chapter1.demo24;

/**
 * @author jinx
 * @date 2018/1/2 22:43
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer:" + System.currentTimeMillis());
        }
    }
}
