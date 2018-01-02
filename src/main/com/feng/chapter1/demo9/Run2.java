package com.feng.chapter1.demo9;

/**
 * @author jinx
 * @date 2017/12/29 14:38
 * Desc:currentThread()方法
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
        myThread.run();
    }
}
