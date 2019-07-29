package com.feng.chapter1.demo33;

/**
 * @author jinx
 * @date 2018/1/3 17:03
 * Desc:
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
