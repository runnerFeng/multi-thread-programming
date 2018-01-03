package com.feng.chapter1.demo30;

/**
 * @author jinx
 * @date 2018/1/3 14:33
 * Desc:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority:"+this.getPriority());
    }
}
