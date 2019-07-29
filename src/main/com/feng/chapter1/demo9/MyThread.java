package com.feng.chapter1.demo9;

/**
 * @author jinx
 * @date 2017/12/29 14:36
 * Desc:
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
