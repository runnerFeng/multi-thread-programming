package com.feng.chapter2.demo33;

/**
 * @author jinx
 * @date 2018/1/16 20:57
 * Desc:
 */
public class Service {
    private boolean isContinue = true;

    public void runMethod() {
        String anyThing = new String();
        while (isContinue) {
            //此处synchronized的作用是让isContinue在两个线程中可见
            synchronized (anyThing) {
            }
        }
        System.out.println("停下来了！");
    }

    public void stop() {
        isContinue = false;
    }
}
