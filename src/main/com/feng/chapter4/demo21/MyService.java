package com.feng.chapter4.demo21;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/03/27 21:00
 * Desc:
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        if (lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }else{
            System.out.println(Thread.currentThread().getName()+"未获得锁");
        }
    }
}
