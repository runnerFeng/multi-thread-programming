package com.feng.chapter4.demo28;

/**
 * @author jinx
 * @date 2018/3/28 12:13
 * Desc:读写互斥/写读互斥
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::read;
        Thread threadA = new Thread(runnable);
        threadA.start();
        Runnable runnable1 = service::write;
        Thread threadB = new Thread(runnable1);
        threadB.start();
    }
}
