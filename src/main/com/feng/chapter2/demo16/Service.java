package com.feng.chapter2.demo16;

/**
 * @author jinx
 * @date 2018/1/8 21:48
 * Desc:
 */
public class Service {
    public static void print(Object object) {
        try {
            synchronized (object) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
