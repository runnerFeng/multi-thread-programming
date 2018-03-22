package com.feng.chapter4.demo20;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/22 23:33
 * Desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin:"+Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE/10; i++) {
                Math.random();
            }
            System.out.println("lock end:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()){
                System.out.println(lock.isHeldByCurrentThread());
                lock.unlock();
            }
        }
    }
}
