package com.feng.chapter3.demo2;

/**
 * @author jinx
 * @date 2018/1/17 21:41
 * Desc:调用wait(),notify()方法前线程必须持有锁
 */
public class Test2 {
    public static void main(String[] args) {
        String lock = new String();
        synchronized (lock) {
            try {
                System.out.println("lock.wait()开始执行");
                lock.wait();
                System.out.println("lock.wait()执行完了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
