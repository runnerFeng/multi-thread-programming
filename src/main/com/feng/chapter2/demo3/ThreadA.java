package com.feng.chapter2.demo3;

/**
 * @author jinx
 * @date 2018/1/3 18:22
 * Desc:
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodA();
    }
}
