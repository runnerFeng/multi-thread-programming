package com.feng.chapter2.demo13;

/**
 * @author jinx
 * @date 2018/1/4 22:42
 * Desc:
 */
public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("线程:" + Thread.currentThread().getName() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程:" + Thread.currentThread().getName() + "离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        try {
            System.out.println("线程:" + Thread.currentThread().getName() + "进入printB");
            Thread.sleep(3000);
            System.out.println("线程:" + Thread.currentThread().getName() + "离开printB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
