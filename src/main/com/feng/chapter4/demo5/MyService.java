package com.feng.chapter4.demo5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/1/30 17:14
 * Desc:
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        try {
            lock.lock();
            System.out.println("await start");
            //使当前执行任务的线程进入了WAITING状态
            condition.await();
            System.out.println("await end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("await 锁释放了");
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal start");
            condition.signal();
            System.out.println("signal end");
        } finally {
            lock.unlock();
            System.out.println("signal 释放锁了");
        }
    }
}
