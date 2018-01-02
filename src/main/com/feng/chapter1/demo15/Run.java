package com.feng.chapter1.demo15;

/**
 * @author jinx
 * @date 2018/1/2 11:54
 * Desc:interrupted()
 */
public class Run {
    public static void main(String[] args) {

        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            Thread.interrupted();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
