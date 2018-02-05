package com.feng.chapter3.demo40;

/**
 * @author jinx
 * @date 2018/02/05 22:22
 * Desc:公平锁与非公平锁
 */
public class RunFair {
    public static void main(String[] args) {
//        final Service service = new Service(true);
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
            System.out.println("threadName：" + Thread.currentThread().getName()+" 运行了");
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
