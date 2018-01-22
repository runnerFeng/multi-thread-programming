package com.feng.chapter3.demo5;

/**
 * @author jinx
 * @date 2018/1/18 21:06
 * Desc:
 */
public class Service {
    public void testMethod(Object object) {
        try {
            synchronized (object) {
                System.out.println("begin wait()");
                object.wait();
                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
