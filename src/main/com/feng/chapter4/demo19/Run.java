package com.feng.chapter4.demo19;

/**
 * @author jinx
 * @date 2018/03/22 23:36
 * Desc:lock.lock()线程正常运行
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService myService = new MyService();
        Runnable runnable = myService::waitMethod;
        Thread threadA = new Thread(runnable);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(200);
        Thread threadB = new Thread(runnable);
        threadB.setName("b");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end");
    }
}
