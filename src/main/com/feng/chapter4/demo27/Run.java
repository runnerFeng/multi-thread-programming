package com.feng.chapter4.demo27;

/**
 * @author jinx
 * @date 2018/3/28 12:13
 * Desc:写写互斥
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::write;
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.start();
    }
}
