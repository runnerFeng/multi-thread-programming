package com.feng.chapter3.demo21;

/**
 * @author jinx
 * @date 2018/1/30 9:49
 * Desc:
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
