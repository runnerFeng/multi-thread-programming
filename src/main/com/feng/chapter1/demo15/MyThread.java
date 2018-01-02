package com.feng.chapter1.demo15;

/**
 * @author jinx
 * @date 2018/1/2 11:52
 * Desc:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        int j = 50000;
        for (int i = 0; i < j; i++) {
            System.out.println("i  "+(i+1));
        }
    }
}
