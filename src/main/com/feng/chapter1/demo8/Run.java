package com.feng.chapter1.demo8;

/**
 * @author jinx
 * @date 2017/12/27 22:50
 * Desc:概率性的出现非线程安全问题，虽然println()内部是同步的，但是i--操作是在进入println()之前发生的，所以有发生非线程安全问题的概率
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
