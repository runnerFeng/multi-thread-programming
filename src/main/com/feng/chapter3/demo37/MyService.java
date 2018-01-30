package com.feng.chapter3.demo37;

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
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("awaitA start");
            //使当前执行任务的线程进入了WAITING状态
            condition1.await();
            System.out.println("awaitA end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("awaitA 锁释放了");
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("awaitB start");
            //使当前执行任务的线程进入了WAITING状态
            condition2.await();
            System.out.println("awaitB end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("awaitB 锁释放了");
        }
    }

    public void signalAll1() {
        try {
            lock.lock();
            System.out.println("signalAll1 start");
            condition1.signalAll();
            System.out.println("signalAll1 end");
        } finally {
            lock.unlock();
            System.out.println("signalAll1 释放锁了");
        }
    }

    public void signalAll2() {
        try {
            lock.lock();
            System.out.println("signalAll2 start");
            condition2.signalAll();
            System.out.println("signalAll2 end");
        } finally {
            lock.unlock();
            System.out.println("signalAll2 释放锁了");
        }
    }
}
