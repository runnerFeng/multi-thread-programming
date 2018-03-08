package com.feng.chapter4.demo9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/02/05 21:39
 * Desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (hasValue == true) {
                condition.await();
                System.out.println("有可能##########连续");
            }
            System.out.println("打印：##########");
            hasValue = true;
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (hasValue == false) {
                condition.await();
                System.out.println("有可能$$$$$$$$$$连续");
            }
            System.out.println("打印：$$$$$$$$$$");
            hasValue = false;
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
