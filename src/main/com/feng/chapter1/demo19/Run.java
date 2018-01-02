package com.feng.chapter1.demo19;

/**
 * @author jinx
 * @date 2018/1/2 18:12
 * Desc:使用异常可以停止线程代码
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(4000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
