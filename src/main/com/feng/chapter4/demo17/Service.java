package com.feng.chapter4.demo17;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/22 22:58
 * Desc:
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
