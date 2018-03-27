package com.feng.chapter4.demo23;

/**
 * @author jinx
 * @date 2018/03/27 21:41
 * Desc:awaitUninterruptibly()线程在wait期间被interrupt但不抛出异常
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}
