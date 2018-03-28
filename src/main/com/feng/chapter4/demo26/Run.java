package com.feng.chapter4.demo26;

/**
 * @author jinx
 * @date 2018/3/28 12:13
 * Desc:读读共享
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::read;
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.start();
    }
}
