package com.feng.chapter2.demo4;

/**
 * @author jinx
 * @date 2018/1/4 10:29
 * Desc:
 */
public class MyObject {
    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //      public void methodB(){
    synchronized public void methodB() {
        try {
            System.out.println("begin methodB threadName:" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
