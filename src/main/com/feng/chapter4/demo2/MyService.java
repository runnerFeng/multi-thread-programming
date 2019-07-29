package com.feng.chapter4.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/1/30 16:46
 * Desc:
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin threadName: " + Thread.currentThread().getName() + " time" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("methodA end threadName: " + Thread.currentThread().getName() + " time" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin threadName: " + Thread.currentThread().getName() + " time" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("methodB end threadName: " + Thread.currentThread().getName() + " time" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
