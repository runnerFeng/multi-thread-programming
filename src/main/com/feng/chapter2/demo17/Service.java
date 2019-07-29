package com.feng.chapter2.demo17;

/**
 * @author jinx
 * @date 2018/1/8 22:18
 * Desc:
 */
public class Service {
    synchronized public void methodA() {
        System.out.println("methodA start");
        boolean flag = true;
        while (flag) {
        }
        System.out.println("methodA end");
    }

    synchronized public void methodB() {
        System.out.println("methodB start");
        System.out.println("methodB end");
    }
}
