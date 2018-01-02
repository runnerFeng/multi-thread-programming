package com.feng.chapter1.demo11;

/**
 * @author jinx
 * @date 2017/12/29 14:51
 * Desc:isAlive()方法
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin:"+myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end:"+myThread.isAlive());
    }
}
