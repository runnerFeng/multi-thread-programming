package com.feng.chapter4.demo12;

/**
 * @author jinx
 * @date 2018/3/8 18:01
 * Desc:getQueueLength():返回正在等待获取此线程的估计数
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.method();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(2000);

        System.out.println("有线程："+service.lock.getQueueLength()+"在等待获取锁！");
    }
}
