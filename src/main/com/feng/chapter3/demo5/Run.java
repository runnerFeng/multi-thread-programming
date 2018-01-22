package com.feng.chapter3.demo5;

/**
 * @author jinx
 * @date 2018/1/18 21:10
 * Desc:wait()释放锁与notify()不释放锁
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}
