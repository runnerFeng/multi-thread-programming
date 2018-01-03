package com.feng.chapter1.demo27;

/**
 * @author jinx
 * @date 2018/1/3 11:00
 * Desc:独占锁
 */
public class Run2 {
    public static void main(String[] args) {
        try {
            MyThread2 thread = new MyThread2();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            //不打印main end因为run方法中System.out.printlin()方法是同步的，所以会出现独占锁造成的线程停止
            System.out.println("main end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
