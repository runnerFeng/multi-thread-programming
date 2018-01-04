package com.feng.chapter2.demo5;

/**
 * @author jinx
 * @date 2018/1/4 11:33
 * Desc:
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("a", "aa");
    }
}
