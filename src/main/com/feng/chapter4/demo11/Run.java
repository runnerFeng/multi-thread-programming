package com.feng.chapter4.demo11;

/**
 * @author jinx
 * @date 2018/3/8 17:54
 * Desc:getHoldCount():当前线程保持(调用lock()方法的次数)此锁的个数
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        service.method1();
    }
}
