package com.feng.chapter2.demo7;

/**
 * @author jinx
 * @date 2018/1/4 12:46
 * Desc:
 */
public class Main {
    protected int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print:" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
