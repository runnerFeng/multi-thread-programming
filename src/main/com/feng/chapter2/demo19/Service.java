package com.feng.chapter2.demo19;

/**
 * @author jinx
 * @date 2018/1/8 22:18
 * Desc:
 */
public class Service {

    public void methodA() {
        Object object = new Object();
        synchronized (object) {
            System.out.println("methodA start");
            boolean flag = true;
            while (flag) {
            }
            System.out.println("methodA end");
        }
    }

    public void methodB() {
        Object object = new Object();
        synchronized (object) {
            System.out.println("methodB start");
            System.out.println("methodB end");
        }
    }
}
