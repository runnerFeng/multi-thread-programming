package com.feng.chapter2.demo29;

/**
 * @author jinx
 * @date 2018/1/14 21:58
 * Desc:volatile关键字的非原子性。
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
