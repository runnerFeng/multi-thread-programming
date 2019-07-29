package com.feng.chapter1.demo12;

/**
 * @author jinx
 * @date 2017/12/29 16:12
 * Desc:
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate---------begin");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println("CountOperate---------end");
    }

    @Override
    public void run() {
        System.out.println("run---------begin");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        //输出为false
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println("run---------end");
    }
}
