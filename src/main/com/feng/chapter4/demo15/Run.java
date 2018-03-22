package com.feng.chapter4.demo15;

/**
 * @author jinx
 * @date 2018/03/22 22:11
 * Desc:boolean hasWaiters(Condition condition)查询是否有线程正在等待与此锁定有关的condition条件
 *      该方法时细粒度condition级别
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {

        final Service service = new Service();

        Runnable runnable = service::waitMethod;

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
