package com.feng.chapter4.demo12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/3/8 17:59
 * Desc:
 */
public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void method() {
        try {
            lock.lock();
            System.out.println("thread:" + Thread.currentThread().getName() + "进入method方法！");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
