package com.feng.chapter4.demo7;

/**
 * @author jinx
 * @date 2018/1/30 17:16
 * Desc:多个condition实现通知部分线程
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        ThreadB threadB = new ThreadB(myService);
        threadB.start();
        Thread.sleep(2000);
        myService.signalAll1();
//        myService.signalAll2();
    }
}
