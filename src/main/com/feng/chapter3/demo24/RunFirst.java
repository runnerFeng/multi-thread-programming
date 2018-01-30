package com.feng.chapter3.demo24;

/**
 * @author jinx
 * @date 2018/1/30 14:16
 * Desc:
 */
public class RunFirst {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        ThreadA threadA = new ThreadA(threadB);
        threadA.start();
        threadB.start();
        System.out.println("main thread run");
    }
}
