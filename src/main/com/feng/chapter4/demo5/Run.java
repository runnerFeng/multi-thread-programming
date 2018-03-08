package com.feng.chapter4.demo5;

/**
 * @author jinx
 * @date 2018/1/30 17:16
 * Desc:condition实现等待通知正确用法
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        Thread.sleep(1000);
        myService.signal();
    }
}
