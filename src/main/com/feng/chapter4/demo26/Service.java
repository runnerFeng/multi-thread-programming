package com.feng.chapter4.demo26;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author jinx
 * @date 2018/3/28 12:08
 * Desc:
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获得读锁：" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
