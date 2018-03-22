package com.feng.chapter4.demo16;

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
            lock.lock();
            System.out.println("是否为公平锁："+lock.isFair());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
