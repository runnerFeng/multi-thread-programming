package com.feng.chapter4.demo11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jinx
 * @date 2018/3/8 17:50
 * Desc:
 */
public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void method1() {
        try {
            lock.lock();
            System.out.println("method1 getHoldCount:"+lock.getHoldCount());
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void method2(){
        try {
            lock.lock();
            System.out.println("method2 getHoldCount:"+lock.getHoldCount());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
