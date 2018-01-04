package com.feng.chapter2.demo10;

/**
 * @author jinx
 * @date 2018/1/4 16:43
 * Desc:
 */
public class ObjectService {
    public void serviceMethodA() {
        synchronized (this) {
            try {
                System.out.println("A beginTime" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A endTime" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B beginTime" + System.currentTimeMillis());
            System.out.println("B endTime" + System.currentTimeMillis());
        }
    }

}
