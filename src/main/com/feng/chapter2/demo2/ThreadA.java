package com.feng.chapter2.demo2;

/**
 * @author jinx
 * @date 2018/1/3 18:22
 * Desc:
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        hasSelfPrivateNum.addI("a");
    }
}
