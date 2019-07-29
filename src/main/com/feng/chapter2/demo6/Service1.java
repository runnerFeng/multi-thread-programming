package com.feng.chapter2.demo6;

/**
 * @author jinx
 * @date 2018/06/07 22:24
 * Desc:
 */
public class Service1 {
    synchronized public void methodA() throws InterruptedException {

        int count = methodB();
        System.out.println(Thread.currentThread().getName() + ":methodA:" + count);

    }

    public int methodB() throws InterruptedException {
        int count = 0;
        for (int i = 0; i < 100000; i++) {
            count += i;
        }
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ":methodB");
        return count;
    }
}
