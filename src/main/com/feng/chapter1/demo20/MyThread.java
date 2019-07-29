package com.feng.chapter1.demo20;

/**
 * @author jinx
 * @date 2018/1/2 18:27
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在sleep状态被停止，进入catch块：" + this.isInterrupted());
        }
    }
}
