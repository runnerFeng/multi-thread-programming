package com.feng.chapter1.demo20;

/**
 * @author jinx
 * @date 2018/1/2 18:29
 * Desc:sleep状态下interrupt线程，会进入catch块，并且清除停止状态
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main cache");
            e.printStackTrace();
        }

    }
}
