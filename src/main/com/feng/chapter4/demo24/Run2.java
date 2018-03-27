package com.feng.chapter4.demo24;

/**
 * @author jinx
 * @date 2018/03/27 22:08
 * Desc:此实验说明线程在等待时间到达前可以被其他线程唤醒
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {

        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(2000);
        Runnable runnable1 = service::nofityMethod;
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
