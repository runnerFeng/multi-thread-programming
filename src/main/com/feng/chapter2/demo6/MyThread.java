package com.feng.chapter2.demo6;

/**
 * @author jinx
 * @date 2018/1/4 12:41
 * Desc:重入锁在同一个类中不同方法之间的调用
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
