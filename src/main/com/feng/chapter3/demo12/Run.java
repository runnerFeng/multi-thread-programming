package com.feng.chapter3.demo12;

/**
 * @author jinx
 * @date 2018/1/23 21:48
 * Desc:生产者消费者模式：多个生产者多个消费者 操作值-假死  造成假死的原因是唤醒同类造成的，解决方法时唤醒时不光唤醒同类并且唤醒异类，即调用notifyAll()方法。
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String s = new String("");
        P p = new P(s);
        C c = new C(s);
        ThreadP[] threadP = new ThreadP[2];
        ThreadC[] threadC = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            threadP[i] = new ThreadP(p);
            threadP[i].setName("生产者" + (i + 1));
            threadC[i] = new ThreadC(c);
            threadC[i].setName("消费者" + (i + 1));
            threadP[i].start();
            threadC[i].start();
        }

        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + "----" + threads[i].getState());
        }
    }
}
