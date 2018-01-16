package com.feng.chapter2.demo33;

/**
 * @author jinx
 * @date 2018/1/16 21:00
 * Desc:synchronized代码块有volatile的作用；synchronized的两个作用：互斥性和可见性
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(2000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        System.out.println("已经发起停止了");
    }

}
