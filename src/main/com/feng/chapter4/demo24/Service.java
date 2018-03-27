package com.feng.chapter4.demo24;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/27 21:57
 * Desc:
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("begin wait：" + System.currentTimeMillis());
            condition.awaitUntil(calendar.getTime());
            System.out.println("end wait  ：" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void nofityMethod(){
        try {
            lock.lock();
            System.out.println("notify begin:"+System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify end  :"+System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
