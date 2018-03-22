package com.feng.chapter4.demo17;

/**
 * @author jinx
 * @date 2018/03/22 23:07
 * Desc:boolean isHeldByCurrentThread()当前线程是否持有该锁
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = service::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
