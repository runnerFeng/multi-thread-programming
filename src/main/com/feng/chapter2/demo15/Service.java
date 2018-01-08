package com.feng.chapter2.demo15;

/**
 * @author jinx
 * @date 2018/1/8 21:48
 * Desc:
 */
public class Service {
    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                int i = 0;
//                while (i<= 4) {
                while (true) {
//                    i++;
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
