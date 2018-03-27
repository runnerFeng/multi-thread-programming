package com.feng.chapter4.demo24;

/**
 * @author jinx
 * @date 2018/03/27 22:02
 * Desc:线程在规定时间后自动唤醒
 */
public class Run {
    public static void main(String[] args) {

        final Service service = new Service();
        //定时自动唤醒自己
        Runnable runnable = service::waitMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
