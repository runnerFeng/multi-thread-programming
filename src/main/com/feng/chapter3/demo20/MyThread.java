package com.feng.chapter3.demo20;

/**
 * @author jinx
 * @date 2018/1/29 18:22
 * Desc:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        int secondValue = (int) (Math.random() * 10000);
        System.out.println(secondValue);
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
