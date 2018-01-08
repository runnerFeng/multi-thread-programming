package com.feng.chapter2.demo18;

/**
 * @author jinx
 * @date 2018/1/8 22:18
 * Desc:
 */
public class Service {
    private static Object object = new Object();

    public void methodA() {
        synchronized (object) {
            System.out.println("methodA start");
            boolean flag = true;
            while (flag) {
            }
            System.out.println("methodA end");
        }
    }

    public void methodB() {
        synchronized (object) {
            System.out.println("methodB start");
            System.out.println("methodB end");
        }
    }
}
