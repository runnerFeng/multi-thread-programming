package com.feng.chapter3.demo12;

/**
 * @author jinx
 * @date 2018/1/23 21:39
 * Desc:
 */
public class P {
    private String string;

    public P(String string) {
        this.string = string;
    }

    public void setValue() {
        try {
            synchronized (string) {
                while (!"".equals(ValueObject.value)) {
                    System.out.println("生产者 " + Thread.currentThread().getName() + " wait了@@@@@@@@@@");
                    string.wait();
                }
                System.out.println("生产者 " + Thread.currentThread().getName() + " running了$$$$$$$$$$");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("生产者 " + Thread.currentThread().getName() + " set的值是：" + value);
                ValueObject.value = value;
                string.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
