package com.feng.chapter3.demo31;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/1/30 16:46
 * Desc:
 */
public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("threadName: "+Thread.currentThread().getName()+" "+(1+i));
        }
        lock.unlock();
    }
}
