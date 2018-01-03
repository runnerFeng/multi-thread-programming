package com.feng.chapter2.demo1;

/**
 * @author jinx
 * @date 2018/1/3 18:22
 * Desc:方法中的变量是线程安全的，对比chapter.demo7实例变量非线程安全需用synchronized关键字
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        hasSelfPrivateNum.addI("b");
    }
}
