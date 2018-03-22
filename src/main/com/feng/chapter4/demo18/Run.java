package com.feng.chapter4.demo18;

/**
 * @author jinx
 * @date 2018/03/22 23:07
 * Desc:boolean isLocked()当前线程是否已经被任意线程持有
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = service::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
