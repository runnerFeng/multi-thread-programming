package com.feng.chapter4.demo14;

/**
 * @author jinx
 * @date 2018/03/22 21:54
 * Desc:boolean hasQueuedThread(Thread thread)查询指定的线程是否正在等待获取此锁
 * boolean hasQueuedThreads()查询是否有线程正在等待获取此锁
 * 这两个方法都是粗粒度lock级别的方法
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = service::waitMethod;

        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
