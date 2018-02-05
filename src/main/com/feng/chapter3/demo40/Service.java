package com.feng.chapter3.demo40;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/02/05 22:19
 * Desc:
 */
public class Service {
    private ReentrantLock reentrantLock;

    public Service(boolean isFair) {
        this.reentrantLock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            reentrantLock.lock();
            System.out.println("threadName：" + Thread.currentThread().getName()+" 获得锁");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
