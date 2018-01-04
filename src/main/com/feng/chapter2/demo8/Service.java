package com.feng.chapter2.demo8;

/**
 * @author jinx
 * @date 2018/1/4 14:59
 * Desc:
 */
public class Service {
    private static String a = "a";

     synchronized public void testMethod() {
        if (a.equals(Thread.currentThread().getName())) {
            System.out.println("threadName:" + Thread.currentThread().getName() + " run beginTime:" + System.currentTimeMillis());
            int i = 10;
            while (true) {
                i--;
                if (i==1) {
                    System.out.println("threadName:" + Thread.currentThread().getName() + " run exceptionTime:" + System.currentTimeMillis());
                    Integer.parseInt(a);
                }
            }
        } else {
            System.out.println("threadName:" + Thread.currentThread().getName() + " run time:" + System.currentTimeMillis());
        }
    }
}
