package com.feng.chapter1.demo13;

/**
 * @author jinx
 * @date 2017/12/29 16:43
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName:" + this.getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName:" + this.getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
