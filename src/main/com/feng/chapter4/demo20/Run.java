package com.feng.chapter4.demo20;

/**
 * @author jinx
 * @date 2018/03/22 23:36
 * Desc:lock.lockInterruptibly()如果当前线程未被中断则获取锁
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService myService = new MyService();
        Runnable runnable = myService::waitMethod;
        Thread threadA = new Thread(runnable);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(200);
        Thread threadB = new Thread(runnable);
        threadB.setName("b");
        threadB.start();
        threadB.interrupt();//标记是否中断该线程
        System.out.println("main end");
    }
}
