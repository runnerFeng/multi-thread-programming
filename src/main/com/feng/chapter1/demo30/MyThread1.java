package com.feng.chapter1.demo30;

/**
 * @author jinx
 * @date 2018/1/3 14:32
 * Desc:
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 run priority:"+this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
