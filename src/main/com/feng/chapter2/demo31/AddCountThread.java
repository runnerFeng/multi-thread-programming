package com.feng.chapter2.demo31;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jinx
 * @date 2018/1/14 22:41
 * Desc:
 */
public class AddCountThread extends Thread{
    private AtomicInteger integer = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(integer.incrementAndGet());
        }
    }
}
