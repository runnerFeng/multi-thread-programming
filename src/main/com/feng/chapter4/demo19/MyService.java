package com.feng.chapter4.demo19;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/22 23:33
 * Desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            lock.lock();
            System.out.println("lock begin:" + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                Math.random();
            }
            System.out.println("lock end:" + Thread.currentThread().getName());
        } finally {
            if (lock.isHeldByCurrentThread()) {
                System.out.println(lock.isHeldByCurrentThread());
                lock.unlock();
            }
        }
    }
}
