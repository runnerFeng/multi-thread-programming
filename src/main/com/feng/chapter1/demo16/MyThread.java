package com.feng.chapter1.demo16;

/**
 * @author jinx
 * @date 2018/1/2 13:55
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50000; i++) {
            System.out.println("i " + (i + 1));
        }
    }
}
