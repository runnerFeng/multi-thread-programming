package com.feng.chapter1.demo22;

/**
 * @author jinx
 * @date 2018/1/2 21:41
 * Desc:暴力停止
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(8000);
            myThread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
