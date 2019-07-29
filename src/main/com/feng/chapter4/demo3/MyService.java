package com.feng.chapter4.demo3;

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
            //使用await方法前要先调用lock.lock()方法获取同步监视器
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
