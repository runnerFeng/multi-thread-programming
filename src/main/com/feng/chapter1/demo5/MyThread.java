package com.feng.chapter1.demo5;

/**
 * @author jinx
 * @date 2017/12/25 22:36
 * Desc:
 */
public class MyThread extends Thread {
    int count = 5;

    public MyThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + Thread.currentThread().getName() + "计算，count=" + count);
        }
    }
}
