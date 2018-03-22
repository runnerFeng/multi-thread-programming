package com.feng.chapter4.demo13;

/**
 * @author jinx
 * @date 2018/03/22 21:40
 * Desc:int getWaitQueueLength(Condition condition)返回等待与此锁定相关的给定条件的condition的线程估计数
 *      该方法是细粒度condition级别
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = () -> service.waitMethod();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);
        service.notifyMethod();
    }
}
