package com.feng.chapter2.demo4;

/**
 * @author jinx
 * @date 2018/1/3 18:22
 * Desc:
 */
public class ThreadB extends Thread {
    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodB();
    }
}
