package com.feng.chapter1.demo21;

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
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止再遇到了sleep状态，进入catch块：" + this.isInterrupted());
        }
    }
}
