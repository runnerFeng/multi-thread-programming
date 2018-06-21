package com.feng.test.demo2;

import java.util.concurrent.CountDownLatch;

/**
 * @author jinx
 * @date 2018/6/19 18:13
 * Desc:两个线程顺序执行-即：a线程执行时需要b线程执行的结果。业务场景：mpc计算中发起协同计算必须要等vcf文件处理完成才能进行，而这两步是由两个线程执行的。
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程执行中");
                    latch.countDown();
                }
            }).start();

        }
        latch.await();
        System.out.println("主线程执行");
    }
}
