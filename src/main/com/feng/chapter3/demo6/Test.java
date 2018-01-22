package com.feng.chapter3.demo6;

/**
 * @author jinx
 * @date 2018/1/22 21:27
 * Desc:当线程呈wait状态时，调用线程对象的interrupt方法会出现InterruptedException。
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object object = new Object();
            ThreadA threadA = new ThreadA(object);
            threadA.start();
            Thread.sleep(3000);
            threadA.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
