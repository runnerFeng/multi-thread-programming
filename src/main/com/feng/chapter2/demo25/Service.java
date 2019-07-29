package com.feng.chapter2.demo25;

/**
 * @author jinx
 * @date 2018/1/11 23:43
 * Desc:
 */
public class Service {
    public void testMethod(UserInfo userInfo) {
        synchronized (userInfo) {
            System.out.println(Thread.currentThread().getName() + " start");
            userInfo.setUsrenae("aaa");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }
    }
}
