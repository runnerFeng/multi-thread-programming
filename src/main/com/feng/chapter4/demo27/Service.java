package com.feng.chapter4.demo27;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author jinx
 * @date 2018/3/28 12:08
 * Desc:
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁：" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
