package com.feng.chapter4.demo22;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/27 21:07
 * Desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + "获得锁的时间为：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println(Thread.currentThread().getName() + "未获得锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
