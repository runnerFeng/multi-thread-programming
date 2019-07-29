package com.feng.chapter1.demo23;

/**
 * @author jinx
 * @date 2018/1/2 22:26
 * Desc:
 */
public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
