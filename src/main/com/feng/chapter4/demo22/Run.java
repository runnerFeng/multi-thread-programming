package com.feng.chapter4.demo22;

/**
 * @author jinx
 * @date 2018/03/27 21:12
 * Desc:boolean tryLock(long timeout, TimeUnit unit)如果在给定时间内没被另一个线程保持，且当前线程未被中断则获取该线程
 *      lock级别
 */
public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable =  service::waitMethod;
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
