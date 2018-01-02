package com.feng.chapter1.demo17;

/**
 * @author jinx
 * @date 2018/1/2 18:12
 * Desc:停止线程代码测试
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
