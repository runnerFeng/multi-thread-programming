package com.feng.chapter1.demo30;

/**
 * @author jinx
 * @date 2018/1/3 14:35
 * Desc:线程的优先级具有继承性
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority:"+Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
        System.out.println("main thread begin priority:"+Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
